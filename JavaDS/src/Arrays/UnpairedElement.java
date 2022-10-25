package Arrays;
import java.util.*;

public class UnpairedElement {
    public static int solution(int[] A) {
        // write your code in Java SE 8
        int index = 0;
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();

        for(int i=0; i<A.length ; i++) {
            hm.put(A[i], hm.getOrDefault(A[i], 1) + 1);
        }
        for(Integer k: hm.keySet()) {
            if(hm.get(k) % 2 != 0) {
                return k;
            }
        }
        return A[index];

    }

    public static void main(String[] args) {
        int a[] = new int[] {9, 3, 9, 3, 9, 7, 9};
        int b = UnpairedElement.solution(a);
        System.out.println(b);

    }

}
