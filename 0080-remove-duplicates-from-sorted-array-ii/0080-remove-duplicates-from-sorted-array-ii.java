class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        int j=1;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1] && nums[i]!=Integer.MIN_VALUE)
            {
                j++;
                if(j>2)
                {for(int a=i+1;a<nums.length-1;a++)
                {nums[a] = nums[a+1];
                }
                 i--;
                 nums[nums.length-1] = Integer.MIN_VALUE;
                }  
                
            }
            else
            {
                if(j>2)
                    k+=j-2;
                j =1;
            }
        }
        System.out.println(k);
        return nums.length-k;
        
    }
}