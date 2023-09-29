//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(in.readLine());
        while (T-- > 0) {
            String s[] = in.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int a[][] = new int[n][m];
            for (int i = 0; i < n; i++) {
                s = in.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    a[i][j] = Integer.parseInt(s[j]);
                }
            }
            Solution ob = new Solution();
            out.println(ob.numberOfEnclaves(a));
        }
        out.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
     int temprow[]={-1,0,1,0};
     int tempcol[]={0,1,0,-1};
     public void dfs(int grid[][],int vis[][],int row,int col)
     {
         vis[row][col]=1;
         int m=grid.length;
         int n=grid[0].length;
         
         for(int i=0;i<4;i++)
         {
             int nrow=temprow[i]+row;
             int ncol=tempcol[i]+col;
             
             if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && grid[nrow][ncol]==1 && vis[nrow][ncol]!=1)
             {
                 dfs(grid,vis,nrow,ncol);
             }
         }
     }
    int numberOfEnclaves(int[][] grid) {

        // Your code here
        int m=grid.length;
        int n=grid[0].length;
        int vis[][]=new int[m][n];
        
        for(int i=0;i<n;i++)
        {
            if(grid[0][i]==1 && vis[0][i]!=1)
            dfs(grid,vis,0,i);
            if(grid[m-1][i]==1 && vis[m-1][i]!=-1)
            dfs(grid,vis,m-1,i);
        }
        for(int i=0;i<m;i++)
        {
            if(grid[i][0]==1 && vis[i][0]!=1)
            dfs(grid,vis,i,0);   
            if(grid[i][n-1]==1 && vis[i][n-1]!=1)
            dfs(grid,vis,i,n-1);
        }
        int ans=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1 && vis[i][j]==0)
                ans++;
            }
        }
        return ans;
    }
}