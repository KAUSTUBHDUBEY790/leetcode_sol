class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int k[] = new int[n];
        for(int i=0;i<n;i++)
        k[nums[i]]++;
        for(int i=0;i<n;i++)
        if(k[i]>1)
        {
        n = i;
        break;}
        return n;

        
    }
}
