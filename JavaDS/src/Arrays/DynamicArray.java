package Arrays;
import java.util.*;

public class DynamicArray {

    /*
        * Complete the 'dynamicArray' function below.
        *
        * The function is expected to return an INTEGER_ARRAY.
        * The function accepts following parameters:
        *  1. INTEGER n
        *  2. 2D_INTEGER_ARRAY queries
        */

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        List<List<Integer>>  listOfList = new ArrayList<>();
        List<Integer>  result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            listOfList.add(new ArrayList<>());
        }

        int lastAnswer = 0;
        for (int i = 0; i < queries.size(); i++) {
            List<Integer> q = queries.get(i);

            if (q.get(0) == 1) {
                listOfList.get((q.get(1) ^ lastAnswer) % n).add(q.get(2));
            } else {
                List<Integer> seq = listOfList.get((q.get(1) ^ lastAnswer) % n);
                lastAnswer = seq.get(q.get(2) % seq.size());
                result.add(lastAnswer);
            }
        }

        return result;

    
    }

    public static void main(String args[]) {
        int[][] qq = new int [][] {{1,0,5}, {1,1,7}, {1,0,3}, {2,1,0}, {2,1,1}};

        List<List<Integer>> queries = new ArrayList<List<Integer>>();
        for(int i=0; i<5; i++) {
            List<Integer> ll = new ArrayList<>();
            ll.add(qq[i][0]);
            ll.add(qq[i][1]);
            ll.add(qq[i][2]);
            queries.add(ll);
        }

        List<Integer> list = DynamicArray.dynamicArray(2, queries);
        System.out.println(list);
    }
    
}
