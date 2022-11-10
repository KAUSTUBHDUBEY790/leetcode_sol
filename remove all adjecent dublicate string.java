class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb= new StringBuilder("");
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();){
            if(!stack.isEmpty()){
                if(stack.peek() == s.charAt(i)){
                    stack.pop();
                }else{
                    stack.push(s.charAt(i));
                }
            }else{
                stack.push(s.charAt(i));
            }
            i++;
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        String str=sb.reverse().toString();
        return str;
    }
}
