class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int s1 = 0;
        int s2 = 0;
        for(int i=0;i<gas.length;i++)
        {
            s1+=gas[i];
            s2+=cost[i];
        }
        if(s1<s2)
            return -1;
        int t=0;
        int r=0;
        for(int i=0;i<gas.length;i++)
        {
            t+=gas[i]-cost[i];
            if(t<0)
            {
                t=0;
                r=i+1;
            }
        }
        return r;
    }
}