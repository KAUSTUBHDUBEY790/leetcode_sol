class Solution {
    public int[] productExceptSelf(int[] nums) {
        int k=1;
        int z = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                z++;
                continue;}
            k*=nums[i];
        }
    if(z==nums.length)
    {Arrays.fill(nums,0);
     return nums;
    }
     for(int i=0;i<nums.length;i++)
     {if(z>0)
     {
         if(nums[i]==0 && z==1)
             nums[i] = k;
         else
             nums[i] = 0;
     }
        else
         nums[i] = k/nums[i];}
    return nums;
    }
}