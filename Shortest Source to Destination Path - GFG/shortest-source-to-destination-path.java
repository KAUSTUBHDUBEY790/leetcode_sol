//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N, M, x, y;
            String S[] = read.readLine().split(" ");
            N = Integer.parseInt(S[0]);
            M = Integer.parseInt(S[1]);
            int a[][] = new int[N][M];
            for (int i = 0; i < N; i++) {
                String s[] = read.readLine().split(" ");
                for (int j = 0; j < M; j++) a[i][j] = Integer.parseInt(s[j]);
            }
            String s1[] = read.readLine().split(" ");
            x = Integer.parseInt(s1[0]);
            y = Integer.parseInt(s1[1]);
            Solution ob = new Solution();
            System.out.println(ob.shortestDistance(N, M, a, x, y));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

//  >> JAVA CODE <<

class Solution {
    int shortestDistance(int N, int M, int A[][], int X, int Y) {
        
        if(A[0][0]==0) return -1;
        
        Queue<int[]> q=new LinkedList<>();
        boolean[][] visited=new boolean[N][M];
        int path=0;
        
        q.add(new int[]{0,0});
        visited[0][0]=true;
        
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
};