package System.out.linkedlist;

public class EvenOddList {
	
	public ListNode oddEvenList(ListNode head) {
        ListNode curr = head;
        ListNode oddList = new ListNode();
        ListNode evenList = new ListNode();
        int i = 1;
        while(curr != null) {
            if((i % 2) != 0) {
                oddList.val = curr.val;
                oddList.next = new ListNode();
                oddList = oddList.next;
                curr = curr.next;
            }
            i++;
        }
        curr = head;
        i = 1;
        while(curr != null) {
            if((i % 2) == 0) {
                evenList.val = curr.val;
                evenList.next = new ListNode();
                evenList = evenList.next;
                curr = curr.next;
            }
            i++;
        }
        return oddList;
    }
	
	public static void main(String[] args) {
		EvenOddList e = new EvenOddList();
		// TODO Auto-generated method stub
		ListNode list = new ListNode(1);
		list.next = new ListNode(2);
		list.next.next = new ListNode(3);
		list.next.next.next = new ListNode(4);
		list.next.next.next.next = new ListNode(5);
		ListNode n = e.oddEvenList(list);
		System.out.println(n);
	}

}
