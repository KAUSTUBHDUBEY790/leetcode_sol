class Solution {
    public int firstMissingPositive(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            while(i!=nums[i]-1 && nums[i]>0 && nums[i]<nums.length && nums[i]!=nums[nums[i]-1])
            {
                int t = nums[i];
                nums[i] = nums[t-1];
                nums[t-1] = t;
            }
        }
        for(int i=1;i<nums.length+1;i++)
        {
            if(nums[i-1]!=i)
                return i;
        }
        return nums.length+1;
        
        
        
    }
}