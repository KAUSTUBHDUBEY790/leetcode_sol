class Solution {
    public int equalPairs(int[][] g) {
        int k=0;
        for(int i=0;i<g.length;i++)
        {
            for(int j=0;j<g.length;j++)
            {
                int f=1;
                for(int i1=0;i1<g.length;i1++)
                {
                    if(g[i][i1]!=g[i1][j])
                    {
                        f=0;
                        break;
                    }

                }
                if(f==1)
                k++;
            }
        }
        return k;
        
    }
}