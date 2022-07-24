package LinkedList;
import java.util.*;

public class MergeKSortedList {
    public static ListNode mergeKLists(ListNode[] lists) {

        // use priority queue to hold all the values in all the lists
        // double looping
        Queue<Integer> q = new PriorityQueue<Integer>();
        for(ListNode x: lists){
            while(x != null){
                q.add(x.val);
                x = x.next;
            }
        }
    
        ListNode ptr = new ListNode(0);
        ListNode ret = ptr;
        
        // Add all the PQ values to a new list
        while(!q.isEmpty()){
            ptr.next = new ListNode(q.poll());
            ptr = ptr.next;
        }
        return ret.next;
       
   }
   
   public static void main(String[] args) {
       
       ListNode list1 = new ListNode(1);
       list1.next = new ListNode(4);
       list1.next.next = new ListNode(5);
       
       ListNode list2 = new ListNode(1);
       list2.next = new ListNode(3);
       list2.next.next = new ListNode(4);
       
       ListNode list3 = new ListNode(2);
       list3.next = new ListNode(6);
       
       
       ListNode[] list = new ListNode[] {list1, list2, list3};
       
       ListNode li = mergeKLists(list);
       while(li != null) {
           System.out.println(li.val);
           li = li.next;
       }

   }
}
