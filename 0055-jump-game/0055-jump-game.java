class Solution {
    public boolean canJump(int[] nums) {
        int m =0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0 && m<=i)
            {m = i;
             break;
            }
            m = Math.max(nums[i]+i,m);    
        }
        if(m>=nums.length-1)
            return true;
        return 
            false;
        
    }
}