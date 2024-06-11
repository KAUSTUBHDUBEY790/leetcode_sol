class Solution {
    public int maxDepth(String s) {
        int k=0,i=0,ans=0;
        while(i<s.length())
        {
            if(s.charAt(i)=='(')
                k++;
            else if(s.charAt(i)==')')
            {
                ans = Math.max(ans,k);
                k--;
            }
            i++;
        }
        return ans;
        
    }
}