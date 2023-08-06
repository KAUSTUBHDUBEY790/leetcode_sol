//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		sc.nextLine();
		while(T-->0)
		{
		    
		    Solution ob=new Solution();
		    
		    String S=sc.nextLine();
		    
		    ArrayList<String> arr = ob.permutation(S);
		    for(String s : arr){
		        System.out.print(s+" ");
		    }
		    System.out.println();
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    public ArrayList<String> permutation(String S)
    {
        //Your code here
         ArrayList<String> l = new ArrayList<>();
        permut(S,"",l);
        Collections.sort(l);
            return l;
        
    }
    public void permut(String s,String k,ArrayList<String> j)
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
