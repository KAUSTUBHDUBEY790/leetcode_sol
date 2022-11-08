// --------------------------------------------------
// Given a string s of lower and upper case English letters.

// A good string is a string which doesn't have two adjacent characters s[i] and s[i + 1] where:

// 0 <= i <= s.length - 2
// s[i] is a lower-case letter and s[i + 1] is the same letter but in upper-case or vice-versa.
// To make the string good, you can choose two adjacent characters that make the string bad and remove them. You can keep doing this until the string becomes good.

// Return the string after making it good. The answer is guaranteed to be unique under the given constraints.

// Notice that an empty string is also good.

 
// Input: s = "leEeetcode"
// Output: "leetcode"
// Explanation: In the first step, either you choose i = 1 or i = 2, both will result "leEeetcode" to be reduced to "leetcode".
// Example 2:

// Input: s = "abBAcC"
// Output: ""
------------------------------------------------------------------------------
//   solution:
  
  class Solution {
    public String makeGood(String s) {
        boolean k = false;
        while(k==false)
        {
            k=true;
            for(int i=0;i<s.length()-1;i++)
            {
                String n ="";
                if(Character.toLowerCase(s.charAt(i))== Character.toLowerCase(s.charAt(i+1)) && s.charAt(i)!=s.charAt(i+1))
                {
                    for(int j=0;j<s.length();j++)
                    if(j!=i && j!=i+1)
                    n+= s.charAt(j);
                    k = false;
                    s =n;
                    break;
                }
            }
        }
        return s;
        
    }
}
