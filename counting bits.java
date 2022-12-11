class Solution {
    public int[] countBits(int n) {
        int ar[]=new int[n+1];
        ar[0]=0;
        for(int i=1;i<n+1;i++)
        ar[i]=check(i);
        return ar;
    }
    public int check(int k)
    {
        int c=1;
        int l=0,z=32;
        while(z-->0)
        {
            if((k&c)!=0)
            l++;
            c=c<<1;
        }
        return l;
    }
}
