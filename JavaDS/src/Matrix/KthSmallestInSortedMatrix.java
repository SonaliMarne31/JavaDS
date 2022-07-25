package Matrix;
import java.util.*;

/* Input: matrix = [[1,5,9],[10,11,13],[12,13,15]], k = 8
Output: 13
Explanation: The elements in the matrix are [1,5,9,10,11,12,13,13,15], and the 8th smallest number is 13 */


public class KthSmallestInSortedMatrix {
    public int kthSmallest(int[][] matrix, int k) {
        int res = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int n = matrix.length;

        // first all elements in PQ
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                queue.offer(matrix[i][j]);
            }
        }

        // now loop until k = 0 and poll each head element i.e. remove it
        while (k > 0) {
            res = queue.poll();
            k --;
        }
        return res;
        
    }
}
