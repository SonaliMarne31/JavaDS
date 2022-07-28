package LinkedList;

public class InsertNodeAtHead {
    static ListNode insertNodeAtHead(ListNode llist, int data) {
        ListNode node = new ListNode(data);
        if (llist == null) return node;

        node.next = llist;
        return node;
    }
}
