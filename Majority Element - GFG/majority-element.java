//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        int j=a[0];
        for(int i=0;i<size;i++)
        {
            if(a[i]>j)
            j=a[i];
        }
        int ar[] =  new int[j+1];
        for(int i=0;i<size;i++)
        ar[a[i]]++;
        for(int i=0;i<j+1;i++)
        {
            if(ar[i]>size/2)
            return i;
        }
        return -1;
    }
}