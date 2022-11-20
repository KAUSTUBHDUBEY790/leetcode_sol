class Solution {
  public int calculate(String s) {
    if (s.length() == 0) return 0;
    s = "(" + s + ")";
    int[] p = {0};
    return eval(s, p);
}
// calculate value between parentheses
private int eval(String s, int[] p){
    int val = 0;
    int i = p[0]; 
    int oper = 1; //1:+ -1:-
    int num = 0;
    while(i < s.length()){
        char c = s.charAt(i);
        switch(c){
            case '+': val = val + oper * num; num = 0; oper = 1; i++; break;// end of number and set operator
            case '-': val = val + oper * num; num = 0; oper = -1; i++; break;// end of number and set operator
            case '(': p[0] = i + 1; val = val + oper * eval(s, p); i = p[0]; break; // start a new eval
            case ')': p[0] = i + 1; return val + oper * num; // end current eval and return. Note that we need to deal with the last num
            case ' ': i++; continue;
            default : num = num * 10 + c - '0'; i++;
        }
    }
    return val;
}
}
