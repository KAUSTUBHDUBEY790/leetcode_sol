//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                System.out.print(ans.get(i)+" ");
            }
            System.out.println();
                        
        }
	}
}


// } Driver Code Ends


class Solution {
    public List<String> find_permutation(String S) {
        // Code here
        
        List<String> l = new ArrayList<>();
        permut(S,"",l);
        HashSet<String> A = new HashSet<String>(l);
        List<String> k = new ArrayList<>(A);
        Collections.sort(k);
            return k;
        
    }
    public void permut(String s,String k,List<String> j)
    {
        if(s.length()==0)
        {
            j.add(k);
            return;
        }
        for(int i=0;i<s.length();i++)
        {
            char ka = s.charAt(i);
            String new_s = s.substring(0,i)+s.substring(i+1);
            permut(new_s,k+ka,j);
        }
    }
}