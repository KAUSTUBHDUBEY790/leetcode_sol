class Solution {
    public int findMaxK(int[] nums) {
        int m=0;
        HashSet<Integer> a = new HashSet<>();
        for(int i:nums)
            a.add(i);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>m)
            {
                if(a.contains(-nums[i]))
                    m = nums[i];
            }     
        }
        return m==0?-1:m;
    }
}