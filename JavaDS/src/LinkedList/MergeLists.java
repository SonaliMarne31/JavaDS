package System.out.linkedlist;

public class MergeLists {

	public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode removeStart = list1;
        for (int i = 0; i < a - 1; i++) {
            removeStart = removeStart.next;
        }
        // iterate the length of removal list and keep track of endNode
        int diff = b - a;
        ListNode removeEnd = removeStart;
        for (int i = 0; i <= diff; i++) {
            removeEnd = removeEnd.next;
        }
        
        // find the tail of list 2 to reconnect our new path
        ListNode tailOfList2 = list2;
        while (tailOfList2.next != null) {
            tailOfList2 = tailOfList2.next;
        }
        
        // restructuring the list
        removeStart.next = list2;
        tailOfList2.next = removeEnd.next;
        return list1;
        
    }
	
	public static void main(String[] args) {
		ListNode list1 = new ListNode(1);
		list1.next = new ListNode(2);
		list1.next.next = new ListNode(3);
		list1.next.next.next = new ListNode(4);
		list1.next.next.next.next = new ListNode(5);
		
		ListNode list2 = new ListNode(1000000);
		list2.next = new ListNode(1000001);
		list2.next.next = new ListNode(1000002);
		
		MergeLists m = new MergeLists();
		ListNode newList = m.mergeInBetween(list1, 3, 4, list2);
		System.out.println(newList);

	}

}
