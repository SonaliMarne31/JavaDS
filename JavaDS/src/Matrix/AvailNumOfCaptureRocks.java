package Matrix;

public class AvailNumOfCaptureRocks {

    // DFS Approach 

    public int dfs(char[][] board, int row, int column, int rowDirection, int columnDirection) {
        
        // IF beyond range, return 0
        if (row < 0 || row >= board.length || column < 0 || column >= board[row].length) return 0;

        // If we meet Bishop i.e. B
        if (board[row][column] == 'B') return 0;

        // If we meet black pawn i.e 'p'
        if (board[row][column] == 'p') return 1;
        
        // else recursive
        return dfs(board, row + rowDirection, column + columnDirection, rowDirection, columnDirection);
    }
    
    
    public int numRookCaptures(char[][] board) {
        
        int count = 0;
        
        // Double loop to visit all the elements in a matrix
        for(int i=0; i<8 ; i++) {
            for(int j=0 ; j<8; j++) {

                // If we see White Rook i.e. R then check all Directons
                if(board[i][j] == 'R') {
                    return 
                    dfs(board, i, j, 0 , 1)+
                    dfs(board, i, j, 0, -1)+
                    dfs(board, i, j, 1, 0)+
                    dfs(board, i, j, -1, 0); 
                }
            }
        }
        return count;
        
    }
}
