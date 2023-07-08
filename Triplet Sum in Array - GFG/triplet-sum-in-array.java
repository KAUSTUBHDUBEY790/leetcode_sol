//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Main
{
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    String inputLine[] = br.readLine().trim().split(" ");
		    int n = Integer.parseInt(inputLine[0]);
		    int X = Integer.parseInt(inputLine[1]);
		    int A[] = new int[n];
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        A[i] = Integer.parseInt(inputLine[i]);
		    }
		    Solution ob=new Solution();
		    boolean ans = ob.find3Numbers(A, n, X);
		    System.out.println(ans?1:0);
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find if there exists a triplet in the 
    //array A[] which sums up to X.
    public static boolean find3Numbers(int arr[], int n, int X) { 
    
       // Your code Here
               if(n<3)
        return false;
        Arrays.sort(arr);
        for(int i=0;i<n;i++)
        {
            int k=i+1,l=n-1;
            while(k<l)
            {
                if(arr[i]+arr[k]+arr[l]==X)
                return true;
                else if(arr[i]+arr[k]+arr[l]>X)
                l--;
                else if(arr[i]+arr[k]+arr[l]<X)
                k++;
                
            }
        }
        return false;
    
    }
}
