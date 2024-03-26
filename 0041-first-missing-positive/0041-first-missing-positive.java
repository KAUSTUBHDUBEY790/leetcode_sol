class Solution {
    public int firstMissingPositive(int[] nums) {
        for(int i=0;i<nums.length;i++)
            if(nums[i]<0)
                nums[i]=0;
        for(int i=0;i<nums.length;i++)
        {
            int k = Math.abs(nums[i]);
            
            if(k-1>=0 && k-1<nums.length &&nums[k-1]>=0)
            {if(nums[k-1]==0)
                nums[k-1] = -(nums.length+1);
             else
             nums[k-1] = -nums[k-1];
            }
        }
        System.out.println(Arrays.toString(nums));
        int i=0;
        while(i<nums.length)
        {
            if(nums[i++]>=0)
            {
                return i;
            }
        }
        return i+1;
    }
}