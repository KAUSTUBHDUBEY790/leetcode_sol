//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.stream.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            
            //taking input n
            int n = Integer.parseInt(br.readLine().trim());
            long arr[] = new long[n];
            String inputLine[] = br.readLine().trim().split(" ");
            
            //adding elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(inputLine[i]);
            }

            Solution ob = new Solution();
            
            //calling equilibriumPoint() function
            System.out.println(ob.equilibriumPoint(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
 public static int equilibriumPoint(long A[], int n) {

        // Your code here
         int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += A[i];
        }
        
        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum -= A[i];
            if (leftSum == totalSum) {
                return i + 1; // Return 1-based indexing
            }
            leftSum += A[i];
        }
        
        return -1;
    }
}
