class Solution {
    public int[] countBits(int n) {
        int k[] = new int[n+1];
        k[0]=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                k[i] = k[i/2];
            }
            else
                k[i] = k[i/2]+1;
                
        }
        return k;
    }
}