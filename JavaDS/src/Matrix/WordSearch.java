package Matrix;

public class WordSearch {

	private int[][] DIRECTIONS = new int[][]{
        {-1, 0}, {0, 1}, {1, 0}, {0, -1}
    };
    
    
    public boolean exist(char[][] board, String word) {
        int R = board.length;
        int C = board[0].length;
        
        for(int i=0; i<R; i++) {
            for (int j=0; j<C; j++) {
                if (exist(R, C, 0, board, word)) return true;
            }
        }
        return false;
    }
    
    
    public boolean exist(int R, int C, int i, char[][] b, String word) {
        
        if(i>= word.length()) return true;
        
        if(R < 0 || C < 0 || R >= b.length || C >= b[i].length || b[R][C] != word.charAt(i)) return false;
        
        
        char ch = b[R][C];
        b[R][C] = '#';
        
        for(int[] d: DIRECTIONS) {
            if(exist(R+d[0], C+d[1], i+1, b, word)) {
                return true;
            }
        }
        b[R][C] = ch;
        
        return false;
    }
    
	
	
	public static void main(String[] args) {
		
		char[][] a = new char[][] {{1,4}, {1,4}};

	}

}
