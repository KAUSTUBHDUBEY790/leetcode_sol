class Solution {
    public int findLongestChain(int[][] p) {
        Arrays.sort(p,Comparator.comparingDouble(o->o[1]));
        int s = p[0][1];
        int chain = 1;
        for(int i=1;i<p.length;i++)
        {
            if(p[i][0]>s)
            {
                s = p[i][1];
                chain++;
            }
        }
        return chain;
    }
}
