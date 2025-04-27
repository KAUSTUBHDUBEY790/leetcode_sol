class Solution {
    public int countSubarrays(int[] nums) {
        int k = 0;
        int ans=0;
        for(int i=2;i<nums.length;i++){
            k+=nums[i-2];
            k+=nums[i];
            if(nums[i-1]/2.0==k)
            ans++;
            k-=(nums[i-2]+nums[i]);
        }
        
        return ans;
    }
}