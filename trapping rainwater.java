class Solution {
    public int trap(int[] h) {
        int k = h.length;
        int s =0;
        int z=0;
        for(int i=0;i<k-1;i++)
        {
            if(h[i]!=h[i+1])
            z=1;
        }
        if(k<=2)
        return 0;
        else if(z==0)
        return 0;
        else{
                for(int i=1;i<k;i++)
                {
                    int m1=0;
                    for(int j=0;j<i;j++)
                    if(m1<h[j])
                    m1=h[j];
                    int m2=0;
                    for(int j=i+1;j<k;j++)
                    if(m2<h[j])
                    m2=h[j];
                    s+=Math.min(m2,m1)-h[i]<0?0:Math.min(m2,m1)-h[i];
                
            }
        }
        return s;
        
    }
}

//------------------------------------------------------------------efficient solution----------------------------------------------------


class Solution {
    public int trap(int[] h) {
        int k = h.length;
        int s=0;
        int rightm[] = new int[k];
        int leftm[] = new int[k];
        leftm[0] = h[0];
        rightm[k-1] = h[k-1];
        for(int i=1;i<k;i++)
        leftm[i]=Math.max(leftm[i-1],h[i]);
        for(int i=k-2;i>=0;i--)
        rightm[i]=Math.max(rightm[i+1],h[i]);


                for(int i=1;i<k;i++)
                {
                    s+=Math.min(rightm[i],leftm[i])-h[i]<0?0:Math.min(rightm[i],leftm[i])-h[i];
        
                
            }


        return s;
        
    }

}
