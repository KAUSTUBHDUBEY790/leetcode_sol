//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int d = sc.nextInt();
            
            Solution ob = new Solution();
            
            ArrayList<Integer> res = ob.rotate (n, d);
            System.out.println(res.get(0));
            System.out.println(res.get(1));
            
           
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    ArrayList<Integer> rotate(int N, int D)
    {
        // your code here
        ArrayList<Integer> list =  new ArrayList<>();
        
        int m = D%16;
        int l = (N<<m|N>>(16-m))&65535;// making leftmost 16  bit 0 by and with 2 power 16 because int is 32 bit and we want only  rightmost 16 bit 
        int r = (N>>m|N<<(16-m))&65535;
        
        list.add(l);
        list.add(r);
        return list;
    }
}

