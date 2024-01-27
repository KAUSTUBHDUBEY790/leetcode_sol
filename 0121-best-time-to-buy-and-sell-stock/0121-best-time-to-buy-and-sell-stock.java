class Solution {
    public int maxProfit(int[] prices) {
        int m = 0;
        int l=0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[l]>prices[i])
            {
                l = i;
            }
            else
            {
                m = Math.max(m,prices[i]-prices[l]);
            }
        }
        return m;
        
    }
}