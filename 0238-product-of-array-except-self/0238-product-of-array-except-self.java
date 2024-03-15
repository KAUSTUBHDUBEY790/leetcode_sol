class Solution {
    public int[] productExceptSelf(int[] nums) {
        int a = 1;
        int z=0;
        for(int i:nums)
        {
            if(i==0)
            {
                z++;
                continue;
            }
            a*=i;
        }
        if(z>1)
            Arrays.fill(nums,0);
        else{
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
                nums[i]= a;
            else if(z==1)
                nums[i]=0;
            else
                nums[i] = a/nums[i];
        }}
        return nums;
        
    }
}