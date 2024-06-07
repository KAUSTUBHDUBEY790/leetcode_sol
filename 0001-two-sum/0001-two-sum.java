class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> a = new ArrayList<>();
        // for(int i:nums)
        //     a.add(i);
        int k[] = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            if(a.contains(target-nums[i]))
            {
                k[0] = i;
                k[1] = a.indexOf(target-nums[i]);
                break;
            }
            a.add(nums[i]);
        }
        return k;
    }
}