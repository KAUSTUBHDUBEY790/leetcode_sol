//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntMatrix
{
    public static int[][] input(BufferedReader br, int n, int m) throws IOException
    {
        int[][] mat = new int[n][];

        for(int i = 0; i < n; i++)
        {
            String[] s = br.readLine().trim().split(" ");
            mat[i] = new int[s.length];
            for(int j = 0; j < s.length; j++)
                mat[i][j] = Integer.parseInt(s[j]);
        }

        return mat;
    }

    public static void print(int[][] m)
    {
        for(var a : m)
        {
            for(int e : a)
                System.out.print(e + " ");
            System.out.println();
        }
    }

    public static void print(ArrayList<ArrayList<Integer>> m)
    {
        for(var a : m)
        {
            for(int e : a)
                System.out.print(e + " ");
            System.out.println();
        }
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int N;
            N = Integer.parseInt(br.readLine());
            
            
            int[][] matrix = IntMatrix.input(br, N, N);
            
            Solution obj = new Solution();
            int res = obj.findMinOperation(N, matrix);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends



class Solution {
    public static int findMinOperation(int N, int[][] m) {
        // code here
        int a[] = new int[N];
        for(int i=0;i<N;i++)
        {
            int sum = 0;
            for(int j=0;j<N;j++)
            sum +=m[i][j];
            a[i] = sum;
        }
        Arrays.sort(a);
        int s=0;
        for(int i=0;i<N-1;i++)
        s+=a[N-1]-a[i];
        int b[] = new int[N];
        for(int i=0;i<N;i++)
        {
            int sum = 0;
            for(int j=0;j<N;j++)
            sum +=m[j][i];
            b[i] = sum;
        }
        Arrays.sort(b);
        int s1=0;
        for(int i=0;i<N-1;i++)
        s1+=b[N-1]-b[i];
        return s1>s?s1:s;

    }
}
        
