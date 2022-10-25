package DataStructs;
import java.util.*;

public class PriorityQueueImpl {
    

    public static void main(String[] args) {


        PriorityQueue<Integer> queue = new PriorityQueue<>();

        queue.add(10);
        queue.add(1);
        queue.add(5);



        int size = queue.size();
        int i=0;


        while(i<=size) {
            int a = queue.poll();
            System.out.println(a);
            i++;
        }
        



    }


}
