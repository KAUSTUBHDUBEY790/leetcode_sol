class Solution {
    public boolean isValid(String s) {
        char [] su = new char[s.length()];
        int k =0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='[' || s.charAt(i)=='{' || s.charAt(i)=='(')
            {
                su[k] = s.charAt(i);
                k++;
            }
            else if(s.charAt(i)==']' || s.charAt(i)=='}' || s.charAt(i)==')')
            {
                if(k==0)
                {
                    k=-1;
                    break;
                }
                else if(s.charAt(i)==']' && su[k-1]=='[')
                {
                    k = k-1;
                }
                else if(s.charAt(i)=='}' && su[k-1]=='{')
                {
                    k = k-1;
                }
                else if(s.charAt(i)==')' && su[k-1]=='(')
                {
                    k = k-1;
                }
                else{
                    k = -1;
                    break;
                }
                    
            }
        }
        if(k==-1)
        {
            return false;
        }
        else if(k==0)
        {
            return true;
        }
        else
            return false;
        
        
    }
}
