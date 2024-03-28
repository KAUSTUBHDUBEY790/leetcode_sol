class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> a = new HashMap<>();
        if(nums.length==1)
            return 1;
        int i=0;
        int max =0;
        for(int j=0;j<nums.length;j++)
        {
            while(a.get(nums[j])!=null && a.get(nums[j])>k){
                int kk = a.get(nums[i]);
                kk--;
                a.put(nums[i++],kk);
            }
            a.put(nums[j],a.getOrDefault(nums[j],1)+1);
            max = Math.max(max,j-i+1);
        }
        return max;
        
    }
}