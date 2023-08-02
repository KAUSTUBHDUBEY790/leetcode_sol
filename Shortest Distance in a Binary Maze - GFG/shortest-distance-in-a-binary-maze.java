//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] grid = new int[n][m];

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < m; j++) {
                    grid[i][j] = sc.nextInt();
                }
            }
            int[] source = new int[2];
            for (int i = 0; i < 2; i++) {
                int x = sc.nextInt();
                source[i] = x;
            }
            int[] dest = new int[2];
            for (int i = 0; i < 2; i++) {
                int x = sc.nextInt();
                dest[i] = x;
            }
            Solution ob = new Solution();
            int ans = ob.shortestPath(grid, source, dest);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    int shortestPath(int[][] A, int[] s, int[] d) {

        // Your code here
        //  >> JAVA CODE <<
        int N = A.length;
        int M = A[0].length;
        int X=d[0];
        int Y=d[1];
        
        if(A[s[0]][s[1]]==0) return -1;
        
        Queue<int[]> q=new LinkedList<>();
        boolean[][] visited=new boolean[N][M];
        int path=0;
        
        q.add(s);
        visited[s[0]][s[1]]=true;
        
        while(!q.isEmpty())
        {
            int size=q.size();
            
            for(int i=0;i<size;i++)
            {
                int[] cur=q.poll();
                
                if(cur[0]==X && cur[1]==Y) return path;
                
                if(cur[0]+1<N && !visited[cur[0]+1][cur[1]] && A[cur[0]+1][cur[1]]==1)
                {
                    q.add(new int[]{cur[0]+1,cur[1]});
                    visited[cur[0]+1][cur[1]]=true;
                }
                if(cur[0]-1>=0 && !visited[cur[0]-1][cur[1]] && A[cur[0]-1][cur[1]]==1)
                {
                    q.add(new int[]{cur[0]-1,cur[1]});
                    visited[cur[0]-1][cur[1]]=true;
                }
                if(cur[1]+1<M && !visited[cur[0]][cur[1]+1] && A[cur[0]][cur[1]+1]==1)
                {
                    q.add(new int[]{cur[0],cur[1]+1});
                    visited[cur[0]][cur[1]+1]=true;
                }
                if(cur[1]-1>=0 && !visited[cur[0]][cur[1]-1] && A[cur[0]][cur[1]-1]==1)
                {
                    q.add(new int[]{cur[0],cur[1]-1});
                    visited[cur[0]][cur[1]-1]=true;
                }
            }
            
            path++;
        }
        
            return -1;
    }
}
