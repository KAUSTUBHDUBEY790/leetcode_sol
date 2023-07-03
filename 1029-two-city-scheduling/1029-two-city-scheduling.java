class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, (a,b)->{
            int d1 = a[0]-a[1];
            int d2 = b[0]-b[1];
            if(d1==d2)
                return a[0]-b[0];
            else
                return d1-d2;
        });
        int k=0;
        for(int i=0;i<costs.length;i++)
        {
            if(i<costs.length/2)
                k+=costs[i][0];
            else
                k+=costs[i][1];
        }
        return k;
    }
}