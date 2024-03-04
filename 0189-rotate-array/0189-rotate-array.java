class Solution {
    public void rotate(int[] nums, int k) {
        int n[] = new int[nums.length];
        if(k>nums.length)
            k = k%nums.length;
        int j=0;
        for(int i=nums.length-k;i<nums.length;i++)
        {
            n[j++] = nums[i];
        }
        for(int i=0;i<nums.length-k;i++)
            n[j++] = nums[i];
        for(int i=0;i<nums.length;i++)
        {
            nums[i] = n[i];
        }
        
    }
}