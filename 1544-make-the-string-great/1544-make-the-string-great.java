class Solution {
    public String makeGood(String s) {
        Stack<Character> a = new Stack<Character>();
        for(char i:s.toCharArray())
        {
            if(!a.isEmpty() && (a.peek()==(char)((i-'A')+'a') || a.peek()==(char)((i-'a')+'A')) )
               a.pop();
            else
               a.push(i);
        }
        StringBuilder sb = new StringBuilder();
while (!a.isEmpty()) {
    sb.append(a.pop());
}

return sb.reverse().toString();
        
    }
}