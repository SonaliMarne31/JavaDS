package Matrix;
import java.util.*;

public class ValidSuduko {
    public boolean isValidSudoku(char[][] board) {
        // HashSet because we want to use key-value that are unique
        HashSet<String> map = new HashSet<>();

        for(int i = 0; i < 9; i ++) {
          for(int j = 0; j < 9; j ++) {
            
            if(board[i][j] != '.') {
              char number = board[i][j];
              // if we cannot add them in map it mean the number is already present in that block
              if(!map.add(number + "in row" + i) 
                 || !map.add(number + "in column" + j) 
                 || !map.add(number + "in block" + i / 3 + "-" + j / 3))
                return false;
            }

          }
        }
        return true;
    }
}
