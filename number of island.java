class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length, m = grid[0].length;
        boolean[][] visit = new boolean[n][m];
        int numsofisland = 0;
        for(int i=0;i<n;i++)
        for(int j=0;j<m;j++)
        {
            if(!visit[i][j] && grid[i][j]=='1')
            {
                dfs(grid,i,j,visit);
                numsofisland++;
            }
        }
        return numsofisland;
        
    }
    public void dfs(char grid[][],int i,int j,boolean bool[][])
    {
        if(i<0 || i>grid.length-1 || j<0|| j>grid[0].length-1||grid[i][j]=='0'||bool[i][j]==true){
        return;}
        bool[i][j] = true;
        dfs(grid,i,j-1,bool);
        dfs(grid,i-1,j,bool);
        dfs(grid,i,j+1,bool);
        dfs(grid,i+1,j,bool);

    }
}
