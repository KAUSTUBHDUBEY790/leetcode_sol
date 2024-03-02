class Solution {
    public int[] sortedSquares(int[] nums) {
       int k=0;
        int j=nums.length-1;
        int a[] = new int[nums.length];
        int c = j;
        while(k<=j)
        {
                if(nums[k]*nums[k]>nums[j]*nums[j])
                {
                    a[c--] = nums[k]*nums[k];
                    k++;
                }
                else
                {
                    a[c--] = nums[j]*nums[j];
                    j--;
                }
            
        }
        return a;
        
    }
}