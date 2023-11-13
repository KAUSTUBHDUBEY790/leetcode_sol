//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java


class Solution
{
    static int mod = 1000000007;
    long countWays(int n,int k)
    {
        //code here.
        long dp[] = new long[n+1];
        return solve(n,k,dp);
    }
    static long add(long a,long b)
    {return (a%mod+b%mod)%mod;}
    static long mul(long a,long b)
    {return ((a%mod)*(b%mod))%mod;}
    
    static long solve(int n,int k,long[] dp)
    {
        if(n==1)
        return k;
        if(n==2)
        return add(k,mul(k,k-1));
        if(dp[n]!=0)
        return dp[n];
        
        return dp[n] = add(mul(solve(n-2,k,dp),k-1)%mod,mul(solve(n-1,k,dp),k-1)%mod)%mod;
        
        
    }
}




//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main (String[] args) throws IOException{
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while(testcases-- > 0){
            //int n=Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] a2 = line.trim().split("\\s+");
            int n =Integer.parseInt(a2[0]);
            int k =Integer.parseInt(a2[1]);

            Solution ob=new Solution();
            //ArrayList<Long> ans=ob.smallestDifferenceTriplet(a,b,c,n);
            long ans=ob.countWays(n,k);
            System.out.println(ans);
        }
    }
}



// } Driver Code Ends