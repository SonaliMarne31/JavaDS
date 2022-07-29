package Implement;

import java.util.NoSuchElementException;

public class ListNode {
    /**
 * A singly-linked list node with an array; supports popping its 1st elements, 
 * and adding elements at the end, possibly by creating a new node
 */
    final int MAX = 5;
    private int contents[] = new int[MAX];
    private int size = 0; // valid elements

    ListNode next = null;

    public ListNode() {}

    public ListNode(ListNode next) {
        this.next = next;
    }

    public boolean isEmpty() { return size == 0; }

    public ListNode addLast(int value) {
        ListNode next = this;
        if (size == MAX) {
            next = new ListNode(this);
        }
        next.contents[next.size ++] = value;
        return next;
    }

    public int removeFirst() {
        if (size == 0) {
            throw new NoSuchElementException("empty queue");
        }
        int value = contents[0];
        size --;
        for (int i=1; i<size; i++) contents[i-1] = contents[i];
        return value;
    }
}
