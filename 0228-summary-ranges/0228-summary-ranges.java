class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> a = new ArrayList<>();
        if(nums.length==0)
            return a;
        int k = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]+1!=nums[i])
            {
                if(nums[i-1]!=k)
                {
                    String s1 = Integer.toString(k);
                    String s2 = Integer.toString(nums[i-1]);
                    String s = s1+"->"+s2;
                    a.add(s);
                    k = nums[i];
                }
                else
                {
                    String s = Integer.toString(k);
                    a.add(s);
                    k = nums[i];
                }                
            }
        }
        if(k==nums[nums.length-1])
            a.add(Integer.toString(k));
        else
        {
            String s1 = Integer.toString(k);
                    String s2 = Integer.toString(nums[nums.length-1]);
                    String s = s1+"->"+s2;
                    a.add(s);            
        }
        return a;
        
    }
}