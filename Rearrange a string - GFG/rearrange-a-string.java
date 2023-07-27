//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution obj = new Solution();
                    System.out.println(obj.arrangeString(s));
                }
                
        }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String arrangeString(String s)
        {
            //code here.
            int a[] = new int[26];
            int k=0;
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)>='A' && s.charAt(i)<='Z')
                {
                    int z=(int)s.charAt(i);
                    a[z-65]++;
                }
                else
                k+=(int)s.charAt(i)-48;
            }
            s="";
            for(int i=0;i<26;i++)
            {
                while(a[i]--!=0)
                s+=(char)(65+i);
            }
            if(k!=0)
            s+=Integer.toString(k);
            return s;
        }
}
