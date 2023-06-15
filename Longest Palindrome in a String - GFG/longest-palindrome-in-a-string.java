//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestPalin(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static String longestPalin(String S){
        // code here
        int si = 0, len = 0;
        int low, high;
        
        for(int i = 0; i < S.length(); i++){
            // even part
            low = i - 1;
            high = i;
            while(low>=0 && high<S.length() && S.charAt(low) == S.charAt(high)){
                
                if(high - low + 1 > len){
                    len = high - low + 1; //current longest pallindrome length
                    si = low;
                }
                low--;
                high++;
            }
            
            // Odd part
            low = i - 1;
            high = i + 1;
            while(low>=0 && high<S.length() && S.charAt(low) == S.charAt(high)){
                
                if(high - low + 1 > len){
                    len = high - low + 1; //current longest pallindrome length
                    si = low;
                }
                low--;
                high++;
            }
            
        }
        
        if(len == 0){
            return S.substring(si, 1); // no pallindrome at all
        }
        return S.substring(si, si+len);
    }

}