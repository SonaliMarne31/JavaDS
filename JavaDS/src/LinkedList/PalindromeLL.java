package LinkedList;
import java.util.*;

public class PalindromeLL {
    public boolean isPalindrome(ListNode head) {
        // List if sequential, Stack if FILO
        List<Integer> list = new ArrayList<Integer>();
        Stack<Integer> s = new Stack<Integer>();
        int j = 0;

        while(head != null) {
            list.add(head.val);
            s.push(head.val);
            head = head.next;
            j++;
        }
        
        int i=0;
        while(i<=j) {
            if(list.get(i) != s.pop()) {
                return false;
            }
            i++;
            j--;
        }
        return true;
        
    }
}
