class Solution {
    public long countSubarrays(int[] nums, int k) {
        int l = nums[0];
        for(int i:nums)
            l = Math.max(l,i);
        int i=0;
        long ans =0;
        int g=0;
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]==l)
                g++;
            while(g==k)
            {
                ans+=nums.length-j;
                if(nums[i]==l)
                    g--;
                i++;
                
            }
                 
       }
        return ans;
    }
}