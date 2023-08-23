//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s1 = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s1[0]);
            int m = Integer.parseInt(s1[1]);
            char[][] grid = new char[n][m];
            for(int i = 0; i < n; i++){
                String S = br.readLine().trim();
                for(int j = 0; j < m; j++){
                    grid[i][j] = S.charAt(j);
                }
            }
            String word = br.readLine().trim();
            Solution obj = new Solution();
            int[][] ans = obj.searchWord(grid, word);
            for(int i = 0; i < ans.length; i++){
                for(int j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
            if(ans.length==0)
            {
                System.out.println("-1");
            }

        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution
{
    public int[][] searchWord(char[][] grid, String word)
    {
        // Code here
        int m=grid.length;
        int n=grid[0].length;
        ArrayList<int[]> ar=new ArrayList<>();
        int[] drow={-1,-1,0,1,1,1,0,-1};
        int[] dcol={0,1,1,1,0,-1,-1,-1};
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==word.charAt(0)){
                    for(int k=0;k<8;k++){
                       if(istrue(i,j,drow[k],dcol[k],word,grid,0)){
                        ar.add(new int[]{i,j});
                        break;
                    } 
                    }
                    
                }
            }
        }
        int s=ar.size();
        int[][] ans=new int[s][2];
        int i=0;
        for(int[] it:ar){
          ans[i++]=it;
        }
        return ans;
    }
        boolean istrue(int i,int j,int dr,int dc,String word,char[][] grid,int ind){
            
           if(ind==word.length())return true;
           int m=grid.length;
           int n=grid[0].length;
           if(i<0 || j<0 || i>=m || j>=n)return false;
           if(word.charAt(ind)!=grid[i][j])return false;
           else if(istrue(i+dr,j+dc,dr,dc,word,grid,ind+1)){
               return true;
           }
           return false;
        }
}