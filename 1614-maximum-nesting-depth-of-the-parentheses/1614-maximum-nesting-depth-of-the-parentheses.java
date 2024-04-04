class Solution {
    public int maxDepth(String s) {
        Stack<Character> a = new Stack<>();
        int m=0;
        for(char i:s.toCharArray())
        {
            if(i=='(')
                a.push(i);
            else if(i==')')
            {
                m = Math.max(m,a.size());
                a.pop();
            }
        }
        return m;
    }
}