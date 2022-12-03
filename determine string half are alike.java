class Solution {
    public boolean halvesAreAlike(String s) {
        char c[] = new char[]{'a','e','i','o','u'};
        int k=0,l=0;
        s=s.toLowerCase();
        for(int j=0;j<s.length()/2;j++)
        {

            for(int i=0;i<5;i++)
            {
            if(s.charAt(s.length()-1-j)==c[i])
            k++;
            if(s.charAt(j)==c[i])
            l++;
            }}
        if(l==k)
        return true;
        return false;


        
    }
}
