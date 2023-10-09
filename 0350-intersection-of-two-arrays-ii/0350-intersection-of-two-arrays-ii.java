class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> a = new ArrayList<>();
        for(int i:nums1)
            a.add(i);
        ArrayList<Integer> b = new ArrayList<>();
        for(int i:nums2)
            if(a.contains(i))
            {
                a.remove(Integer.valueOf(i));
                b.add(i);
            }
        int r[] = new int[b.size()];
        int l=0;
        for(int i:b)
            r[l++] = i;
        return r;
    }
    
}