class Solution {
    public int findCenter(int[][] edges) {
        int k = edges.length;
        int l[] = new int[k+2];
        for(int i=0;i<k;i++)
        {
            l[edges[i][0]]++;
            l[edges[i][1]]++;
            if(l[edges[i][0]]>1) return edges[i][0];
            if(l[edges[i][1]]>1) return edges[i][1];

        }
        return -1;


        
    }
}
