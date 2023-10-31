//{ Driver Code Starts
//Initial Template for JAVA

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            
            int[] cost = new int[N];
            
            for(int i=0 ; i<N ; i++)
                cost[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.minCostClimbingStairs(cost,N));
        }
    }
}
// } Driver Code Ends


//Back-end complete function Template for Java

class Solution {
    static int minCostClimbingStairs(int[] cost , int N) {
        //Write your code here
        int dp[] = new int[N];
        return Math.min(min(cost,dp,0,0),min(cost,dp,1,0));
        
    }
    static int min(int[] c,int[] d,int k,int s)
    {
        if(k>=c.length)
         return 0;
         if(d[k]!=0)
         return d[k];
        s = c[k] + Math.min(min(c,d,k+1,s),min(c,d,k+2,s));
        d[k] = s;
        return s;
    }
};