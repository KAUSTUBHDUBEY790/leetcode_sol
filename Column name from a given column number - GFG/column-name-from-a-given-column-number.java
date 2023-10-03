//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*; 
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
    		System.out.println (new Solution().colName (n));
        }
        
    }
}

// Contributed By: Pranay Bansal 

// } Driver Code Ends


//User function Template for Java

class Solution
{
    String colName (long n)
    {
        String op = "";
        // your code here
        if (n <= 26){
            op = Character.toString((char)(64+n));
        }
        else{
            StringBuilder str = new StringBuilder();
            while (n > 0){
                n--;
                char ch = (char)('A' + n%26);
                str.insert(0,ch);
                n/=26;
            }
            op = str.toString();
        }
        return op;
    }
}