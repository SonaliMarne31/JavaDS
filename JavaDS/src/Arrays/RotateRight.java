package Arrays;

public class RotateRight {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        int len = A.length;
        int [] result = new int[len];
            
        for(int i=0; i<len; i++) {
            int index = (K+i) % len;
            result[index] = A[i];
        }
        return result;
    }
}
