package LinkedList;

public class MiddleOfLL {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        // Move slow by one step
        // Move fast by twp steps
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
