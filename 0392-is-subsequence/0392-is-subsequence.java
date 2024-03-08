class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0;
        while(i<s.length())
        {
            while(j<t.length())
            {
                if(s.charAt(i)==t.charAt(j))
                {
                    break;}
                j++;
            }
            if(j==t.length())
                return false;
            i++;
            j++;
        }
        return true;
        
    }
}