class Solution {
    public int rob(int[] nums) {
        
        int n= nums.length;
        if(n==1)
            return nums[0];
        ArrayList<Integer> a =  new ArrayList<>();
        ArrayList<Integer> a1 =  new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(i!=n-1)
                a.add(nums[i]);
            if(i!=0)
                a1.add(nums[i]);
        }
        int dp1[] = new int[n];
        int dp2[] = new int[n];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
        return Math.max(sum(a,0,dp1),sum(a1,0,dp2));        
    }
    
	public int sum(ArrayList<Integer> n,int a,int dp[])
	{
		if(a>=n.size())
		return 0;
		if(a==n.size()-1)
		return n.get(a);
		if(dp[a]!=-1)
		return dp[a];
		int in = sum(n,a+2,dp)+n.get(a);
		int ex = sum(n,a+1,dp)+0;
		return dp[a] = Math.max(in,ex);
	}
}