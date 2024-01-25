class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)
            return 0;
        int a =0;
        int k=0;
        Set<Character> m = new HashSet<Character>();
        
        m.add(s.charAt(a));
        for(int i=1;i<s.length();i++)
        {
            while(m.contains(s.charAt(i)))
            {
                m.remove(s.charAt(a));
                a++;
            }
                m.add(s.charAt(i));
             k = Math.max(k,m.size());     
        }
        return k>m.size()?k:m.size();
    }
}