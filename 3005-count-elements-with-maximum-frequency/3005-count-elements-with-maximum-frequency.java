class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> a = new HashMap<>();
        int m=0;
        for(int i=0;i<nums.length;i++)
        {
            a.put(nums[i],a.getOrDefault(nums[i],0)+1);
            m = Math.max(a.get(nums[i]),m);
        }
        int k=0;
        for(int i: a.values())
        {
            if(i==m)
            {
                k+=m;
            }
        }
        return k;
        
    }
}