class Solution {
    public int[] productExceptSelf(int[] nums) {
        int t=1;
        int[] r = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            r[i] = t;
            t = t*nums[i];
        }
         t=1;
        for(int i=nums.length-1;i>=0;i--)
        {
            r[i] = t*r[i];
            t = t*nums[i];
        }
        return r;
    }
}