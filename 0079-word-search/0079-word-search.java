class Solution {
    public boolean exist(char[][] b, String w) {
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[0].length;j++)
            {
                if(dfs(i,j,0,b,w))
                    return true;
            }
        }
        return false;     
    }
    public boolean dfs(int r,int c,int i,char[][]b,String w)
    {
        if(i==w.length())
            return true;
        if(r<0 || c<0 || r>=b.length || c>=b[0].length || w.charAt(i)!=b[r][c])
            return false;
        char ch = b[r][c];
        b[r][c] = '*';
        boolean res = dfs(r+1,c,i+1,b,w) || dfs(r-1,c,i+1,b,w) || dfs(r,c+1,i+1,b,w) ||dfs(r,c-1,i+1,b,w);
        b[r][c] = ch;
        return res;
        
        
    }
    
}