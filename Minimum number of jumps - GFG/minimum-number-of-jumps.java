//{ Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	 
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int t = Integer.parseInt(br.readLine()); 

        while(t-- > 0){
            int size = Integer.parseInt(br.readLine());
            String[] arrStr = ((String)br.readLine()).split("\\s+");
            int[] arr= new int[size];
            for(int i = 0;i<size;i++){
                arr[i] = Integer.parseInt(arrStr[i]);
            }
            System.out.println(new Solution().minJumps(arr));
        }
	 }
	 
}

// } Driver Code Ends


class Solution{
static int minJumps(int[] arr){
        // your code here
        int N=arr.length;
        if(N==1)
        return 0;
        
        int res=0;
        for(int i=0;i<N;){
            if(arr[i]==0)
            return -1;
            int max=i+1;
            int j=1;
            while(j<=arr[i]){
                if(i+j>=N-1)
                return res+1;
                if(arr[i+j]+j>=arr[max]+(max-i)){
                    max=i+j;
                }
                j++;
            }
            if(arr[max]==0)
            return -1;
            i=max;
            res++;
        }
        return res;
    }
}