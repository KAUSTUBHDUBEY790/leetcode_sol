class Solution {
    public List<Integer> intersection(int[][] nums) {
        HashSet<Integer> a = new HashSet<Integer>();
        for(int i:nums[0])
            a.add(i);
        HashSet<Integer> b = new HashSet<>();
        for(int[] i:nums)
        {for(int j:i){
            {if(a.contains(j))
                    b.add(j);
            }}
         a.clear();
         a.addAll(b);
         b.clear();
        }
        List<Integer> z = new ArrayList<>(a);
        Collections.sort(z);
        return z;
        
    }
}