class Solution {
    public void sortColors(int[] nums) {
        int m = 0;
        int l = 0;
       int  h = nums.length-1;
        while(m<=h)
        {
            if(nums[m]==0)
            {
                swap(nums,l,m);
                l++;
                m++;
            }
            else if(nums[m]==1)
                m++;
            else {
                swap(nums,m,h);
                    h--;
                }
            }

        
    }
   private void swap(int [] n,int m, int k)
    {
        int v;
        v = n[m];
        n[m] = n[k];
        n[k] = v;
        
    }

}
