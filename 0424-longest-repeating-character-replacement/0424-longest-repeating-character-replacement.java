class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> a = new HashMap<Character,Integer>();
        int l=0;
        int m=0;
        int mf = 0;
        for(int i=0;i<s.length();i++)
        {
            a.put(s.charAt(i),a.get(s.charAt(i))==null?1:a.get(s.charAt(i))+1);
            mf = Math.max(mf,Collections.max(a.values()));
            while((i-l+1)-mf>k)
            {
                a.put(s.charAt(l),a.get(s.charAt(l))-1);
                l++;
            }
            m = Math.max(m,i-l+1);   
        }
        return m;
        
    }
}