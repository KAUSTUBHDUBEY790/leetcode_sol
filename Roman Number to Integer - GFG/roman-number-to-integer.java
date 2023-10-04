//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String roman = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.romanToDecimal(roman));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int romanToDecimal(String s) {
        // code here
        int i=0,sum=0;
        HashMap<Character,Integer>h=new HashMap<Character,Integer>();
        h.put('I',1);h.put('V',5);h.put('X',10);h.put('L',50);
        h.put('C',100);h.put('D',500);h.put('M',1000);
        while(i<s.length())
        {
            if(i+1<s.length() && h.get(s.charAt(i))<h.get(s.charAt(i+1)))
            {sum+=h.get(s.charAt(i+1))-h.get(s.charAt(i));i++;}
            else
            sum+=h.get(s.charAt(i));
            i++;
        }
        return sum;
    }
}