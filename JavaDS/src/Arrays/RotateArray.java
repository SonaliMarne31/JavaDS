package Arrays;
import java.util.*;

public class RotateArray {
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here
        for(int i=0; i<d; i++) {
            int x=arr.get(0);
            arr.remove(arr.get(0));
            arr.add(x);
        }
        return arr;

    }
    public static void main(String args[]) {
        int[] arr = new int[] {1,2,3,4,5};
        List<Integer> arrList = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            arrList.add(arr[i]);
        }
        List<Integer> ll =  RotateArray.rotateLeft(2, arrList);
        System.out.println(ll);
    }
}
