//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for (int i = 0; i < V; i++)
                list.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            if (new Solution().isCyclic(V, list) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
// } Driver Code Ends


/*Complete the function below*/

class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        int v[] = new int[V];
        int d[] = new int[V];
        for(int i=0;i<V;i++)
        {
            if(v[i]==0)
            {if(isCycledfs(i,adj,v,d))
            return true;}
        }
        return false;
    }
    public boolean isCycledfs(int s, ArrayList<ArrayList<Integer>> adj,int[] v,int [] d)
    {
        v[s]=1;
        d[s]=1;
        for(int i=0;i<adj.get(s).size();i++)
        {
            if(v[adj.get(s).get(i)]==0)
            {
                if(isCycledfs(adj.get(s).get(i),adj,v,d))
                return true;
            }
            else if(d[adj.get(s).get(i)]==1)
            {
                return true;
            }

        }
        d[s]=0;
        return false;
    }
}