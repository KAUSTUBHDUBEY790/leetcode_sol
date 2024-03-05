class Solution {
    public int candy(int[] r) {
        int a[] = new int[r.length];
        if(r.length<2)
            return 1;
        int k=0;
        Arrays.fill(a,1);
        for(int i=1;i<r.length;i++)
        {
            if(r[i]>r[i-1])
                a[i]+=a[i-1];
        }
        for(int i=r.length-2;i>=0;i--)
        {
            if(r[i]>r[i+1])
                a[i] = Math.max(a[i],a[i+1]+1);
        }
        for(int i=0;i<r.length;i++)
        {
            k+=a[i];
        }
        

        return k;
        
    }
}