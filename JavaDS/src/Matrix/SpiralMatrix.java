package Matrix;
import java.util.*;

public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        int  m = matrix.length-1;
        int n = matrix[0].length-1;
        
        // init variables
        int row_begin = 0;
        int col_begin = 0;
        int row_end = m;
        int col_end = n;

        // keep going until we are out of bounds
        while(row_begin <= row_end && col_begin <= col_end){ 
            
            // First go from R -> L until end col
            for(int i = col_begin; i <= col_end ; i++){      
                list.add(matrix[row_begin][i]);                
            }
            row_begin++;    
            // Now go from Top R -> Bottom R                                         
            for(int i = row_begin; i <= row_end ; i++){    
                list.add(matrix[i][col_end]);                     
            }
            col_end--; 
            // R -> L until first col                                                 
            if(row_begin <= row_end){                            
                for(int i = col_end; i >= col_begin  ; i--){      
                list.add(matrix[row_end][i]);                   
            }
            }
            row_end--;
            // Bottom L to Top L                                            
            if(col_begin <= col_end){                                
                for(int i =row_end; i >= row_begin ; i--){      
                list.add(matrix[i][col_begin]);                     
            }
            }
            col_begin++;                                               
                                                                    
        } // keep going until we reach the bounds
        return list;
    }
}
