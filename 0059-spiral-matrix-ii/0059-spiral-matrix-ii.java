class Solution {
    public int[][] generateMatrix(int n) {
        int a[][] = new int[n][n];
        int sr = 0;
        int sc = 0;
        int er = n-1;
        int ec = n-1;
        int k = 1;
        while(sr<=er && sc<=ec)
        {
            for(int i=sc;i<=ec;i++)
                a[sr][i] = k++;
            sr++;
            for(int i=sr;i<=er;i++)
                a[i][ec] = k++;
            ec--;
            for(int i=ec;i>=sc;i--)
            {
                // if(sr==er)
                //     break;
                a[er][i] = k++;
            }
            er--;
            for(int i=er;i>=sr;i--)
            {
                // if(sc==ec)
                //     break;
                a[i][sc] = k++;}
            sc++;
        }
        return a;
        
    }
}