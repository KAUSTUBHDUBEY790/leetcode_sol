class Solution {
    public int arrangeCoins(int n) {
        // long l = 0,r=n;
        // while(l<=r){
        //     long m = l+(r-l)/2;
        //     long k = m*(m+1)/2;
        //     if(k==n)
        //     return (int)m;
        //     else if(k>n)
        //     {
        //         r = m-1;
        //     }
        //     else
        //     l=m+1;
        // }
        return (int)(Math.sqrt(2 * (long)n + 0.25)-0.5);
    }
}