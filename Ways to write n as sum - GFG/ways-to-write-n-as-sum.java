//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{

  public static void main (String[] args)  {
     Scanner s=new Scanner(System.in);
     int t=s.nextInt();
     while(t-->0){
         int n=s.nextInt();
         Solution obj = new Solution();
         System.out.println(obj.countWays(n));
     }

   }
}

// } Driver Code Ends




class Solution
{
    // function to count ways in which n can be
    // expressed as the sum of two or more integers
    int countWays(int n)
    {
        // your code here
        int w=n;n=n-1;
        long[] arr=new long[n];
        for(int i=0;i<arr.length;i++)
            arr[i]=i+1;
        long[][] dp=new long[n+1][w+1];
        for(int i=0;i<=n;i++) dp[i][0]=1;
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=w;j++) {
                if(arr[i-1]<=j)
                    dp[i][j]=dp[i][j-(int)arr[i-1]]+dp[i-1][j];
                else
                    dp[i][j]=dp[i-1][j];
            }
        }
        return (int)dp[n][w];
    }
}