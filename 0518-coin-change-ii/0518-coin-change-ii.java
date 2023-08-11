class Solution {
    public int change(int a, int[] coins) {
        int dp[] = new int[a+1];
        Arrays.fill(dp,0);
        dp[0]=1;
        for(int c:coins)
        {
            for(int i=c;i<=a;i++)
                dp[i] += dp[i-c];
        }
        return dp[a];
    }
}