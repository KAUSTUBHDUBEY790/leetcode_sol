class Solution {
    public int search(int[] nums, int t) {
        int l=0;
        int h = nums.length-1;
        while(l<=h)
        {
            int m = (l+h)/2;
            if(nums[m]==t)
                return m;
            if(nums[l]<=nums[m])
            {
                if(nums[l]<=t && nums[m]>=t)
                    h = m-1;
                else
                    l=m+1;
            }
            else
            {
                if(nums[m]<=t && nums[h]>=t)
                    l = m+1;
                else
                    h= m-1;
            }
        }
        return -1;
        
    }
}