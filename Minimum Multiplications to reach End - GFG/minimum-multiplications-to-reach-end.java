//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int start = sc.nextInt();
            int end = sc.nextInt();

            Solution ob = new Solution();
            int ans = ob.minimumMultiplications(a, start, end);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
int minimumMultiplications(int[] arr, int start, int end) {
 int maxLimit = 100001;
        int[] steps = new int[maxLimit];
        Arrays.fill(steps, -1);

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        steps[start] = 0;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            if (current == end) {
                return steps[current];
            }

            for (int number : arr) {
                int newStart = (current * number) % 100000;
                if (steps[newStart] == -1) {
                    steps[newStart] = steps[current] + 1;
                    queue.offer(newStart);
                }
            }
        }

        return -1; 

    }
}