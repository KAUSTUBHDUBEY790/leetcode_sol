//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
        	int[] array = new int[n];
        	for (int i=0; i<n ; i++ ) {
        		array[i] = sc.nextInt();
        	}
            Solution ob = new Solution();
            long[] ans = new long[n];
            ans = ob.productExceptSelf(array, n); 

           	for (int i = 0; i < n; i++) { 
				System.out.print(ans[i]+" ");
			} 
            System.out.println();
            t--;
        }
    } 
} 
  


// } Driver Code Ends


//User function Template for Java


class Solution 
{ 
	public static long[] productExceptSelf(int arr[], int n) 
	{ 
        // code here
        long arr2[] = new long[arr.length];
        long product = 1;
        int zeros = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == 0)
                zeros++;
            else
                product *= arr[i];
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i] == 0 && zeros-1 > 0)
            {
                arr2[i] = 0;
            }
            else if(arr[i] == 0 && zeros-1 == 0)
            {
                arr2[i] = product;
            }
            else if(arr[i] != 0 && zeros > 0)
            {
                arr2[i] = 0;
            }
            else if(arr[i] !=0 && zeros == 0){
                arr2[i] = product/arr[i];
            }
            else 
                continue;
        }
        return arr2;
	} 
} 
