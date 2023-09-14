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
                    int n = sc.nextInt();
                    int sum = sc.nextInt();
                    int arr[] = new int[n];
                    for(int i = 0;i<n;i++)
                    arr[i] = sc.nextInt();
                    
                    Solution ob = new Solution();
                    System.out.println(ob.perfectSum(arr,n,sum));
                }
        }
}    
// } Driver Code Ends


class Solution{

	public int perfectSum(int arr[],int n, int sum) 
	{ 
	    // Your code goes here
	    int MOD = (int)1e9+7;

        // Initialize a 1D array to store the count of subsets
        int[] dp = new int[sum + 1];

        // There is one way to make sum = 0, which is by not including any element
        dp[0] = 1;

        // Fill the dp array using a bottom-up approach
        for (int i = 0; i < n; i++) {
            for (int j = sum; j >= arr[i]; j--) {
                // If the current element can be included in the subset
                // (i.e., it is less than or equal to the current sum),
                // update dp[j] by adding dp[j - arr[i]]
                dp[j] = (dp[j] + dp[j - arr[i]]) % MOD;
            }
        }

        // The result is stored in dp[sum]
        return dp[sum];
	}}