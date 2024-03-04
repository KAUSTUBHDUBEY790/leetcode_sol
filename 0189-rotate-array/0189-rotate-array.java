class Solution {
    public void rotate(int[] nums, int k) {
        if(k>=nums.length)
            k=k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);

        
    }
    public void reverse(int a[],int i,int j)
    {
        while(i<j)
        {
            int t = a[i];
            a[i] = a[j];
            a[j] = t;
            i++;
            j--;
        }
    }
}