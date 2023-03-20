class Solution {
    public void solveSudoku(char[][] board) {
     // Normalization means to get numbers in a block(grid). B[nR + 1/3].
     if(board == null || board.length == 0)
        return;
    solve(board); 
    }
    public boolean solve(char[][] board)
    {
        for(int i = 0; i < board.length; i++)
        {
            for(int j = 0;j < board[0].length; j++)
            {
                if(board[i][j] == '.')
                {
                    for(char c = '1'; c <= '9'; c++)
                    {
                        // trial, try 1 to 9
                        if(isValid(board, i, j, c))
                        {
                            board[i][j] = c;
                            if(solve(board))
                                return true;
                            else
                            board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    } 
    private boolean isValid(char[][] board, int row, int col, char c)
    {
        int nRow = 3 * (row / 3);
        int nCol = 3 * (col / 3);
        for(int i = 0; i < 9; i++)
        {
            if(board[i][col] == c)
                return false;
            if(board[row][i] == c)
                return false;
            if(board[nRow + i / 3][nCol + i % 3] == c)
                return false;
        }
        return true;
    }
}