class Solution
{
    public int minimumAverageDifference(int[] nums)
    {
        int N = nums.length, id = 0;
        long min = Integer.MAX_VALUE;
        long[] pre = new long[N];
        pre[0] = nums[0];
        for(int i = 1; i < N; i++)
            pre[i] = pre[i-1]+nums[i];
        for(int i = 0; i < N-1; i++)
        {
            long diff = (long)(Math.abs(Math.round(pre[i]/(i+1) - Math.round((pre[N-1]-pre[i])/(N-i-1)))));
            if(diff < min)
            {
                id = i;
                min = diff;
            }
        }
        if(min > pre[N-1]/N) // Taking all on the first/left
            return N-1;
        return id;
    }
}
