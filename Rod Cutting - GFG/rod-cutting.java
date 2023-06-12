//{ Driver Code Starts
import java.io.*;
import java.util.*;

class RodCutting {

    public static void main(String args[])throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        
        int t = Integer.parseInt(in.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(in.readLine().trim());
            String s[]=in.readLine().trim().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(s[i]);

            Solution ob = new Solution();
            out.println(ob.cutRod(arr, n));
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution{
    public int cutRod(int price[], int totRod) {
        //code here
         int n = price.length;
         int length[]= new int[totRod];
         for(int i=0;i<totRod;i++){
             length[i]=i+1;
         }
         
         int dp[][]= new int[n+1][totRod+1];
         for(int i=1;i<n+1;i++){
             for(int j=1;j<totRod+1;j++){
                 if(length[i-1]<=j){
                     //valid condition
                     dp[i][j]= Math.max(price[i-1]+dp[i][j-length[i-1]] , dp[i-1][j]);
                 }else{
                     dp[i][j]=dp[i-1][j];
                 }
             }
         }
         return dp[n][totRod];
    }
}