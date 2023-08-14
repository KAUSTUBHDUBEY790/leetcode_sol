//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine();
            String[] S = s.split(" ");
            int[] v = new int[2 * n + 2];
            for(int i = 0; i < 2 * n + 2; i++)
            {
                v[i] = Integer.parseInt(S[i]);
            }
            Solution ob = new Solution();
            int[] ans = ob.singleNumber(v);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int[] singleNumber(int[] nums)
    {int len = nums.length;  // size of nums
int size = 0;       //size for the new array we gonna make for return    
       HashMap <Integer,Integer> map = new HashMap<>();
       for(int i =0;i<len;i++){
           if(!map.containsKey(nums[i])){       //if key is not present in map then put nums[i]
               map.put(nums[i],0);
               size++;              // increasing the size of array we gonna return 
           }else{
               int data = map.get(nums[i]);
               map.put(nums[i],data+1);
               size = size-1;      //decreasing the size 
           }
       }
       int k=0;  // for indexing of our array
       int arr[] = new int[size];
       for(int i =0;i<len;i++){
           int a = map.get(nums[i]); // get the frequency of number occured in a nums
           if(a == 0){          //if frequency is 0 the we gonna put that number in our array
               arr[k] = nums[i];
               k++;
           }
       }
       
        Arrays.sort(arr);     // make our array sort

return arr;

    }
}

