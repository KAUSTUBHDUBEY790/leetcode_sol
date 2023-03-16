class Solution {
    public List<Integer> spiralOrder(int[][] m) {
        List<Integer> a = new ArrayList<>();
        int r= m.length;
        int c = m[0].length;
        int startr = 0;
        int startc = 0;
        int endr= r-1;
        int endc = c-1;
        while(startr<=endr && startc<=endc)
        {
            for(int i=startc;i<=endc;i++)
            a.add(m[startr][i]);
            for(int i=startr+1;i<=endr;i++)
            a.add(m[i][endc]);
            for(int i=endc-1;i>=startc;i--)
            {   if(startr==endr)
                break;
                a.add(m[endr][i]);}
            for(int i=endr-1;i>=startr+1;i--)
            {
                if(startc==endc)
                break;
                a.add(m[i][startc]);}

                startr++;
                startc++;
                endr--;
                endc--;

        }
        return a;
        
    }
}