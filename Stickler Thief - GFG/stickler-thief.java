//{ Driver Code Starts
import java.util.*;
import java.io.*;

class GFG
 {
	public static void main (String[] args)
	 {
	  
	  //taking input using Scanner class
	  Scanner sc = new Scanner(System.in);
	  
	  //taking count of testcases
	  int t = sc.nextInt();
	  while(t-- > 0){
	      
	      //taking count of houses
	      int n = sc.nextInt();
	      int arr[] = new int[n];
	      
	      //inserting money present in 
	      //each house in the array
	      for(int i = 0; i<n; ++i)
	           arr[i] = sc.nextInt();
  	      
  	      //calling method FindMaxSum() of class solve
  	      System.out.println(new Solution().FindMaxSum(arr, n));
	 }
   }
}
// } Driver Code Ends


class Solution
{
    //Function to find the maximum money the thief can get.
public int FindMaxSum(int houses[], int n){
     int dp[] = new int[n+1];
     return sum(houses,0,dp);
}
public int sum(int [] h,int n,int [] d)
{
    if(n>=h.length)
    return 0;
    if(n==h.length-1)
    return h[h.length-1];
    if(d[n]!=0)
    return d[n];
    int in = sum(h,n+2,d)+h[n];
    int e = sum(h,n+1,d)+0;
    return d[n] = Math.max(in,e);
    
}
}