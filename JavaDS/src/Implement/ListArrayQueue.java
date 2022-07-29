package Implement;
    /**
 * A simple queue on top of nodes that keep arrays of elements
 */
public class ListArrayQueue {
    ListNode first = new ListNode();
    ListNode last = first;
    public void enqueue(int value) {
        last = last.addLast(value);
    }
    public int dequeue() {
        if (first.isEmpty() && first != last) {
            first = first.next;
        }
        return first.removeFirst();
    }
}

