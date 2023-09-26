//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {
            String[] nk = br.readLine().trim().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            Solution sln = new Solution();
            ArrayList<ArrayList<Integer>> ans = sln.fourSum(a, k);
            for (ArrayList<Integer> v : ans) {
                for (int u : v) {
                    System.out.print(u + " ");
                }
                System.out.print("$");
            }
            if (ans.isEmpty()) {
                System.out.print(-1);
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// arr[] : int input array of integers
// k : the quadruple sum required

class Solution {
        public static ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);
        for(int s=0;s<arr.length-3;s++){
            if(s>0&&arr[s]==arr[s-1]){
                continue;
            }
            for(int s2=s+1;s2<arr.length-2;s2++){
                if(s2>s+1&&arr[s2]==arr[s2-1]){
                    continue;
                }
                int s3=s2+1;
                int s4=arr.length-1;
                while(s3<s4){
                    int sum=arr[s]+arr[s2]+arr[s3]+arr[s4];
                    if(sum==k){
                        ArrayList<Integer> ls = new ArrayList<>();
                        ls.add(arr[s]);
                        ls.add(arr[s2]);
                        ls.add(arr[s3]);
                        ls.add(arr[s4]);
                        list.add(ls);
                        while(s3<s4&&arr[s3]==arr[s3+1]){
                            s3++;
                        }
                        while(s3<s4&arr[s4]==arr[s4-1]){
                            s4--;
                        }
                        s3++;
                        s4--;
                    }
                    if(sum<k){
                         while(s3<s4&&arr[s3]==arr[s3+1]){
                            s3++;
                        }
                        s3++;
                    }
                    if(sum>k){
                        while(s3<s4&arr[s4]==arr[s4-1]){
                            s4--;
                        }
                        s4--;
                    }
                }
            }
        }
        return list;
    }
}