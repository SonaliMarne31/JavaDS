package System.out.linkedlist;

public class MergeSortedList {

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	        
		ListNode head = new ListNode();
        ListNode currentNode = head;
        
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                currentNode.next = l1;
                l1 = l1.next;
            }else if(l1.val > l2.val){
                currentNode.next = l2;
                l2 = l2.next;
            }
            currentNode = currentNode.next;   
        }
        
        if(l1 != null)
            currentNode.next = l1;
        else if(l2 != null)
            currentNode.next = l2;
      
        return head.next;
	}
	
	
	public static void main(String[] args) {
		MergeSortedList m = new MergeSortedList();
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(4);
		
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);
		
		m.mergeTwoLists(l1, l2);

	}

}
