class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> a = new HashSet<>();
        for(int i:nums1)
            a.add(i);
        ArrayList<Integer> s = new ArrayList<>();
        for(int i:nums2)
            if(a.contains(i))
                if(!s.contains(i))
                    s.add(i);
        int r[] = new int[s.size()];
        for(int i=0;i<s.size();i++)
            r[i] = s.get(i);
        
        return r;
    }
}