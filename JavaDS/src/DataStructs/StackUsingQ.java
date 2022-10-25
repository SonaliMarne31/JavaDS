package DataStructs;
import java.util.*;

public class StackUsingQ {
    Deque<Integer> q;

    public StackUsingQ() {
        q = new ArrayDeque<Integer>();
    }
    
    public void push(int x) {
        q.addFirst(x);
    }
    
    public int pop() {
        return q.removeFirst();
    }
    
    public int top() {
        return q.peekFirst();
    }
    
    public boolean empty() {
        boolean isEmpty = false;
        
        if(q.size() <= 0) return true;
        
        return isEmpty;
    }

    public static void main(String[] a) {
        StackUsingQ obj = new StackUsingQ();
        obj.push(1);
        obj.push(2);
        int param_3 = obj.top();
        System.out.println(param_3);
        int param_2 = obj.pop();
        System.out.println(param_2);
        boolean param_4 = obj.empty();
        System.out.println(param_4);
    }
}
