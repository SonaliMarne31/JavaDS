package LinkedList;

public class InsertNodeAtTail {
    static ListNode insertNodeAtTail(ListNode head, int data) {
        
        if(head == null)
            return new ListNode(data);
        else
            head.next = insertNodeAtTail(head.next, data);
                        
        return head;
    }
}
