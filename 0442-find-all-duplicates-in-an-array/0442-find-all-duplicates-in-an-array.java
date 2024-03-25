class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> ar = new ArrayList<Integer>(4);
        for(int  i = 0 ;i < nums.length;i++)
        {
            int n = Math.abs(nums[i]);
            if(nums[n-1]<0)
            ar.add(Math.abs(nums[i]));
            else
            nums[n-1] = -1*nums[n-1];
        }
        return ar;
    }
}