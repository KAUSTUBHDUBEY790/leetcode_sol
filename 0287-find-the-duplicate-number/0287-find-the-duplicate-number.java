class Solution {
    public int findDuplicate(int[] nums) {
        int s=0,f=0;
        while(true)
        {
            s = nums[s];
            f = nums[nums[f]];
            if(f==s)
                break;     
        }
        int s2 = 0;
        while(true)
        {
            s2 = nums[s2];
            s = nums[s];
            if(s2==s)
                break;
        }
        return s;
        
    }
}