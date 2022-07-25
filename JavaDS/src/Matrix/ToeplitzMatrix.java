package Matrix;

/* 
Given an m x n matrix, return true if the matrix is Toeplitz. Otherwise, return false.

A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same elements. */

public class ToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {

        // double loop to check all the elements in matrix

        for (int r = 0; r < matrix.length; ++r) {
           for (int c = 0; c < matrix[0].length; ++c) {
               
                // if not equal then return false, else we are good
                if (r > 0 && c > 0 && matrix[r-1][c-1] != matrix[r][c]) {
                   return false;
                }
            }
        }
       return true;
   }
}
