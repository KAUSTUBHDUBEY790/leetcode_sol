class Solution {
    public void moveZeroes(int[] nums) {
        int k[] = new int[nums.length];
        int l=0,z=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            l++;
            else
            k[z++]=nums[i];
        }
        int kz=0;
        while(kz<nums.length)
        {
            if(kz<z)
            nums[kz] = k[kz++];
            else
            nums[kz++] = 0;
        }
        
    }
}
