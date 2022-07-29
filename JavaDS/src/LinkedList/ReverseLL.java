package LinkedList;

public class ReverseLL {
	
	public static ListNode reverseList(ListNode head) {
		
		 ListNode prev = null;
		 ListNode curr = head;
		 while(curr != null) {
			 ListNode nextEL = curr.next;
			 curr.next = prev;
			 prev= curr;
			 curr = nextEL;
		 }
		 
		 return prev;
		
	}
	
	
	public static ListNode deleteNodes(ListNode head, int num) {
		
		ListNode current = head;
		ListNode prev=null;
		 
		if(current != null && current.val > num) {
			head = head.next;
			current = null;
			current = head;
			
		}
		
		while(current != null) {
			if(current.val<num) {
				prev = current;
//				head = head.next;
				current = current.next;
			} else {
				prev.next = current.next;
//				head = prev.next;
				current = prev.next;
			}
			
		}
		
	   
	    return head;
		
	}
	
	public static void main(String args[]) {
		ListNode list = new ListNode(7);
		list.next = new ListNode(3);
		list.next.next = new ListNode(4);
		list.next.next.next = new ListNode(8);
		list.next.next.next.next = new ListNode(5);
		list.next.next.next.next.next = new ListNode(1);
		
		
		ListNode li = deleteNodes(list, 6);
		while(li != null) {
			System.out.println(li.val);
			li = li.next;
		}
		
//		ListNode l = reverseList(list);
//		while(l != null) {
//			System.out.println(l.val);
//			l = l.next;
//		}
		
		
	}
	 
}
