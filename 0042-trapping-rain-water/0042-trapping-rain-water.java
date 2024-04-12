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