//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isCycle(V, adj);
            if (ans)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        int v[] = new int[V];
        int p[] = new int[V];
        Queue<Integer> a = new LinkedList<>();
        for(int i=0;i<V;i++)
        {
            if(v[i]==0)
            {
                if(isC(adj,v,p,a,i))
                return true;
            }
        }
        return false;
    }
    public boolean isC(ArrayList<ArrayList<Integer>> adj,int[]v,int[]p,Queue<Integer>a,int s)
    {
        p[s] = -1;
        v[s] = 1;
    a.add(s);
    while(!a.isEmpty()) {
        int c = a.remove();
        for(int i = 0; i < adj.get(c).size(); i++) {
            if(v[adj.get(c).get(i)] == 1 && adj.get(c).get(i) != p[c]) // Fix the condition here
                return true;
            else if(v[adj.get(c).get(i)] == 0) {
                v[adj.get(c).get(i)] = 1;
                p[adj.get(c).get(i)] = c;
                a.add(adj.get(c).get(i));
            }
        }
    }
    return false;
        
    }
}