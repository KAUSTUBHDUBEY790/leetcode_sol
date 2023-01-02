class Solution {
    public boolean detectCapitalUse(String w) {
        if(w.length()==1)
        return true;
        if(w.charAt(0)>='A' && w.charAt(0)<='Z' && w.length()>1)
        {
            if(w.charAt(1)>='A' && w.charAt(1)<='Z')
            {
                for(int i=0;i<w.length();i++)
                {
                    if(!(w.charAt(i)>='A' && w.charAt(i)<='Z'))
                    return false;
                }
                return true;
            }
            else{
                for(int i=1;i<w.length();i++)
                {
                    if(w.charAt(i)>='A' && w.charAt(i)<='Z')
                    return false;
                }
                return true;
            }

        }
        else{
            for(int i=1;i<w.length();i++)
                {
                    if(w.charAt(i)>='A' && w.charAt(i)<='Z')
                    return false;
                }
                return true;

        }
        
    }
}
