package LinkedList;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class InsertAtNthPosition {

    // Hackerrank
    // Complexity Analysis

    /* Time complexity : O(L)O(L).

    The algorithm makes one traversal of the list of LL nodes. Therefore time complexity is O(L)O(L).

    Space complexity : O(1)O(1).

    We only used constant extra space. */
    public static ListNode insertNodeAtPosition(ListNode llist, int data, int position) {
        // Write your code here
        ListNode node = new ListNode(data);
        if(position==0){
            node.next = llist.next;
            llist=node;
        }else{
            ListNode aux = new ListNode(0);
            aux.next = llist;
            for(int i=0;i<position;i++)aux=aux.next;
            node.next = aux.next;
            aux.next=node;
        }

        return llist;
            
    }
}
