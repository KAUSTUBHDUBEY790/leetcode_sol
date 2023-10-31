class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int dp[] = new int[cost.length];
        return Math.min(min(cost,dp,0,0),min(cost,dp,1,0));
        
    }
    static int min(int[] c,int[] d,int k,int s)
    {
        if(k>=c.length)
         return 0;
         if(d[k]!=0)
         return d[k];
        s = c[k] + Math.min(min(c,d,k+1,s),min(c,d,k+2,s));
        d[k] = s;
        return s;
    }
}