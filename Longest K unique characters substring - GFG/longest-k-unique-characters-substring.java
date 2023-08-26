//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        
        HashMap<Character,Integer> hm = new HashMap<>();
        int ans = -1 , cnt = 0, l=0;
        
        for(int i=0; i<s.length(); i++){
         
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
            
            while(l<i&&hm.size()>k){
                
                if(hm.get(s.charAt(l))>1)
                    hm.put(s.charAt(l),hm.get(s.charAt(l))-1);
                else
                    hm.remove(s.charAt(l));
                l++;
        
            }
            
            if(hm.size()==k)
                ans = Math.max(ans,i-l+1);
            
        }
       
        return ans;
    }
}