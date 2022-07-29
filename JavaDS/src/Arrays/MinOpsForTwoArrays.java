package Arrays;
import java.util.*;

public class MinOpsForTwoArrays {
    public static void main(String[] args)
    {
         
        // Given array A[]
        int[] A = { 1, 2, 5, 17 };
        int[] B = { 4, 3, 7, 11 };

        int[] C = { 1, 3, 7, 13 };
        int[] D = { 4, 5, 9, 16 };
         

        int count = findMinOps(A, B);
        System.out.println(count);

        int count1 = findMinOps(C, D);
        System.out.println(count1);
         
    }

    private static int findMinOps(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        int count = 0;

        int start = 0;
        int end = b.length - 1;

        // A = [1, 2, 5, 17]
        // B = [3, 4, 7, 11]
        
        while(start<end) {

            if(a[start] > b[start] || a[end] < b[end]) return -1;

            a[start] += 2;
            a[end] -= 2;

            if(a[start] == b[start]) start++;
            if(a[end] == b[end]) end--;
            count++;
        }

        return count;
    }
}
