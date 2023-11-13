//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(read.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.disarrange(N));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static long mod = 1000000007;
    static long disarrange(int N){
        // code here
        long dp[] = new long[N+1];
        Arrays.fill(dp,-1);
        return arrange(N,dp);
    }
    static long arrange(int N,long[] dp)
    {
        if(N==1)
        return 0;
        if(N==2)
        return 1;
        if(dp[N]!=-1)
        return dp[N];
        return dp[N] = ((N-1))*(((arrange(N-1,dp)%mod)+(arrange(N-2,dp)%mod))%mod)%mod;
    }
}