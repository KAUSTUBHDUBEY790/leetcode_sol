class Solution {
    public int longestSubsequence(int[] arr, int d) {
        HashMap<Integer,Integer> a = new HashMap<>();
        int m=1;
        for(int i=0;i<arr.length;i++)
        {
            if(a.containsKey(arr[i]-(d)))
            {
                a.put(arr[i],1+(a.get(arr[i]-(d))));
                m = Math.max(m,a.get(arr[i]));
            }
            else
                a.put(arr[i],1);
        }
        return m;
    }
}