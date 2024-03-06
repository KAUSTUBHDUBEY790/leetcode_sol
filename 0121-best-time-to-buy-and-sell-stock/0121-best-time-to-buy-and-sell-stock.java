class Solution {
    public int maxProfit(int[] prices) {
        int k=0;
        int j=0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]<prices[j])
                j =i;
            else
                k = Math.max(k,prices[i]-prices[j]);
        }
        return k;
        
    }
}