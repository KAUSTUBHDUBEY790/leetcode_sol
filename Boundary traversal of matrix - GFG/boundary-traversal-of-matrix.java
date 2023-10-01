//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim());
        
        while(t-- > 0)
        {
            String s[] = in.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int a[][] = new int[n][m];
            s = in.readLine().trim().split(" ");
            int ind=0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = Integer.parseInt(s[ind++]);
                }
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.boundaryTraversal(a, n, m);
            for (int i : ans) {
                out.print(i + " ");
            }
            out.println();
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to return list of integers that form the boundary 
    //traversal of the matrix in a clockwise manner.
    static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m)
    {
        // code here by   ayush chaubey
        //n = row of matrix
        // m = column of matrix
        
        ArrayList<Integer> ayu= new ArrayList<Integer>();
        
        int a=0;//for row
        int b=0;//for column'
        
        
        
        
        //if matrix has only one row
        if(n==1)
        {
             for(int j=0;j<m;j++)
        {
            ayu.add(matrix[0][j]);
        }
        return ayu;
        }
        
        
        // if matrix have only obe column
        if(m==1)
        {
             for(int j=0;j<n;j++)
        {
            ayu.add(matrix[j][0]);
        }
        return ayu;
        }
        
        //pahla row print ho gaya
        for(int j=0;j<m;j++)
        {
            ayu.add(matrix[a][j]);
        }
        
        //last column k liye
        b=m-1;
        
        for(int i=1;i<n;i++)
        {
            ayu.add(matrix[i][b]);
        }
        
        // last row k liye
        a=n-1;
        
        for(int j=b-1;j>=0;j--)
        {
             ayu.add(matrix[a][j]); 
        }

        
        // for 1st col
       
          for(int i=a-1;i>0;i--)
        {
             ayu.add(matrix[i][0]); 
        }

return ayu;
        
        
        
        
    }
}

