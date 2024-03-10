class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> a = new HashSet<>();
        HashSet<Integer> aa = new HashSet<>();
        for(int i:nums1)
            a.add(i);
        for(int i:nums2)
            if(a.contains(i))
                aa.add(i);
        int j[] = new int[aa.size()];
        int s=0;
        for(int i:aa)
            j[s++] = i;
        return j;
        
                
        
        
    }
}