class Solution {
    public String maximumOddBinaryNumber(String s) {
        int k=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
                k++;
        }
        int n = s.length();
        s = "";
        while(k>1)
        {
            s+='1';
            k--;
        }
        while(s.length()<n-1)
        {
            s+='0';
        }
        return s+='1';
        
    }
}