class Solution {
    public List<Integer> spiralOrder(int[][] m) {
        List<Integer> a = new ArrayList<>();
        int sr = 0;
        int sc = 0;
        int er = m.length-1;
        int ec = m[0].length-1;
        while(sr<=er && sc<=ec)
        {
            for(int i=sc;i<=ec;i++)
            {
                a.add(m[sr][i]);
            }
            for(int i=sr+1;i<=er;i++)
                a.add(m[i][ec]);
            for(int i=ec-1;i>=sc;i--)
            {
                if(sr==er)
                    break;
                a.add(m[er][i]);
            }
            for(int i=er-1;i>=sr+1;i--)
            {
                if(sc==ec)
                    break;
                a.add(m[i][sc]);
            }
            sr++;
            sc++;
            er--;
            ec--;
        }

        return a;
        
    }
}