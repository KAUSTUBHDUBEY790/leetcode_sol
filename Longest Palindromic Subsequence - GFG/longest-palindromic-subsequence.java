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
                    System.out.println(obj.longestPalinSubseq(s));
                }
                
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    public int longestPalinSubseq(String S)
    {
        //code here
        if(S.length()==0)
            return 0;
        int dp[][]=new int[S.length()][S.length()];
        for(int row[]:dp)
        {
            Arrays.fill(row,-1);
        }
        String a=S;
        StringBuilder x=new StringBuilder();
        x.append(S);
        x.reverse();
        String b=x.toString();
        int ans=longPali(a,b,0,0,dp);
        return ans;
    }
    public int longPali(String a, String b, int i, int j,int [][]dp)
    {
        if(i>=a.length() || j>=b.length())
        {
            return 0;
        }
        if(dp[i][j]!=-1)    return dp[i][j];
        if(a.charAt(i)==b.charAt(j))
        {
            return dp[i][j]=1+longPali(a,b,i+1,j+1,dp);
        }
        else
            return dp[i][j]=Math.max(longPali(a,b,i,j+1,dp),longPali(a,b,i+1,j,dp));
    }
}