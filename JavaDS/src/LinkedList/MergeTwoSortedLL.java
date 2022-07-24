package LinkedList;

public class MergeTwoSortedLL {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	        
		ListNode head = new ListNode();
        ListNode currentNode = head;
        
        // Loop until one is list is empty
        while(l1 != null && l2 != null){

            // compare values
            if(l1.val <= l2.val){
                currentNode.next = l1;
                l1 = l1.next;
            }else if(l1.val > l2.val){
                currentNode.next = l2;
                l2 = l2.next;
            }
            currentNode = currentNode.next;   
        }
        
        // whichever is not null, we need to append it to the current list
        if(l1 != null)
            currentNode.next = l1;
        else if(l2 != null)
            currentNode.next = l2;
      
        return head.next;
	}
	
	
	public static void main(String[] args) {
		MergeTwoSortedLL m = new MergeTwoSortedLL();
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(4);
		
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);
		
		m.mergeTwoLists(l1, l2);

	}

}
