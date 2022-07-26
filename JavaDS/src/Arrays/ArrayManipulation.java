package Arrays;
import java.util.*;

public class ArrayManipulation {
    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        // Write your code here
        int numQ = queries.size();
        long[] computation = new long[n];
        
        for(int i=0; i<numQ; i++) {
            int a = queries.get(i).get(0) -1 ;
            int b = queries.get(i).get(1) - 1 ;
            int k = queries.get(i).get(2);
            computation[a] += k;
            if(b+1 < n) {
                computation[b+1] -= k;
            }
        }
        long max = 0; long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += computation[i];
            max = Math.max(max, sum);
        }
        return max;
    }

    public static void main(String args[]) {
        List<List<Integer>> queries = new ArrayList<>();
        List<Integer> qq = new ArrayList<>();

        qq.add(1);
        qq.add(2);
        qq.add(100);
        queries.add(qq);

        qq = new ArrayList<>();
        qq.add(2);
        qq.add(5);
        qq.add(100);
        queries.add(qq);

        qq = new ArrayList<>();
        qq.add(3);
        qq.add(4);
        qq.add(100);
        queries.add(qq);

        long l = ArrayManipulation.arrayManipulation(5, queries);
        System.out.println(l);
        
    }
}
