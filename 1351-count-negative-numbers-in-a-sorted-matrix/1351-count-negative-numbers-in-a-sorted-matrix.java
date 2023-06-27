class Solution {
    public int countNegatives(int[][] g) {
        int k= g.length;
        int l = g[0].length;
        int s=0;
        for(int i=0;i<k;i++)
        {
            for(int j=l-1;j>=0;j--)
            {
                if(g[i][j]>=0)
                    break;
                else
                    s++;
            }
        }
        return s;
        
    }
}