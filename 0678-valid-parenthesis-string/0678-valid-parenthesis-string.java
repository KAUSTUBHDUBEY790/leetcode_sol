class Solution {
    public boolean checkValidString(String s) {
        Stack<Character> a = new Stack<>();
        int max=0,min=0;
        for(char i:s.toCharArray())
        {
            if(i=='(')
            {
                max+=1;
                min+=1;
            }
            else if(i==')')
            {
                max-=1;
                min-=1;
            }
            else{
                max+=1;
                min-=1;
            }
            if(max<0)
                return false;
            if(min<0)
                min=0;
        }
        return min==0;
        
    }
}