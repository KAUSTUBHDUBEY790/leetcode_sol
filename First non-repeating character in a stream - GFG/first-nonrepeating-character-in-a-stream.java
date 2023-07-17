//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String A = br.readLine().trim();
            Solution ob = new Solution();
            String ans = ob.FirstNonRepeating(A);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution
{
    public String FirstNonRepeating(String A)
    {
        // code here
        HashMap<Character, Integer> map = new HashMap<>();
        Queue<Character> q = new LinkedList<>();

        StringBuilder result = new StringBuilder();

        for (char c : A.toCharArray()) {
            // Update the character count in the HashMap
            map.put(c, map.getOrDefault(c, 0) + 1);

            // Add the character to the queue if it is the first occurrence
            if (map.get(c) == 1) {
                q.add(c);
            }

            // Remove characters from the queue that have occurred more than once
            while (!q.isEmpty() && map.get(q.peek()) > 1) {
                q.poll();
            }

            // If the queue is empty, there is no non-repeating character, so append '#'
            if (q.isEmpty()) {
                result.append("#");
            } else {
                // Append the first non-repeating character to the result
                result.append(q.peek());
            }
        }

        return result.toString();
    }
    }