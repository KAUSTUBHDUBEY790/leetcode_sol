//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        //reading input using BufferedReader class
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        //reading total testcases
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            //reading length of line segment
            int n = Integer.parseInt(read.readLine().trim());
            
            
            //reading 3 segment lengths
            String str[] = read.readLine().trim().split(" ");
            
            int x = Integer.parseInt(str[0]);
            int y = Integer.parseInt(str[1]);
            int z = Integer.parseInt(str[2]);
            
            
            //calling method maximizeCuts() of class Solution()
            //and printinting the result
            System.out.println(new Solution().maximizeCuts(n, x, y, z));
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to find the maximum number of cuts.
    public int maximizeCuts(int n, int x, int y, int z)
    {
       //Your code here
      int a[] = {x,y,z};
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        int k = seg(n, a,dp);
        return k<0?0:k;
    }
    public static int seg(int n,int a[],int[] dp)
    {
        if(n<0)
        return Integer.MIN_VALUE;
        if(n==0)
        return 0;
        if(dp[n]!=-1)
        return dp[n];
        int k = Integer.MIN_VALUE;
        for(int i=0;i<3;i++)
        {
            int l = seg(n-a[i],a,dp);
            k = Math.max(l+1,k);
            // System.out.println(k);
        }
        return dp[n] = k;
    }
}
