package LinkedList;

public class RemoveNthFromLast {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        // Use 2 pointers
        // prev = null, curr = head;
        ListNode prev = new ListNode(-1, head);
        ListNode current = head;
        
        // move current until n-1 places
        for (int i = 0; i < n-1 && current.next != null; i++) {
            current = current.next;
        } 
        // Now move both prev and curr one one step
        while (current.next != null) {
            prev = prev.next;
            current = current.next;
        }

        // if cycle found
        if (prev.next == head) {
            return prev.next.next;
        }
        
        // if no cycle, we are good remove node
        prev.next = prev.next.next;
        return head;

    }

    public static void main(String args[]) {
        ListNode list1 = new ListNode(1);
		list1.next = new ListNode(2);
		list1.next.next = new ListNode(3);
        list1.next.next.next = new ListNode(4);
        list1.next.next.next.next = new ListNode(5);
	
		RemoveNthFromLast n = new RemoveNthFromLast();
        ListNode newList = n.removeNthFromEnd(list1, 2);
		while(newList != null) {
			System.out.println(newList.val);
			newList = newList.next;
		}
    }
}
