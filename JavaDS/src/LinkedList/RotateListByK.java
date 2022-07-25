package LinkedList;

public class RotateListByK {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null )
           return head;
       
        ListNode fast=head;
        ListNode slow=head;
        
        int size=1;
        
        while(fast.next!=null){
            fast=fast.next;
            size++;
        }
        k=k%size;
        for(int i=1; i<=size-k-1; i++){
            slow=slow.next;
        }
        
        fast.next=head;
        head=slow.next;
        slow.next=null;
        
        return head;
    }
}
