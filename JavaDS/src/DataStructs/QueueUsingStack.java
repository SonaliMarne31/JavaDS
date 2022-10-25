package DataStructs;

import java.util.*;

public class QueueUsingStack {

    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();
    public QueueUsingStack() {
        
    }
    
    public void push(int x) {
        st1.push(x);
    }
    
    public int pop() {
        if (st1.empty()) {
            return -1;
        } else {
            while (!st1.empty()) {
                st2.push(st1.pop());
            }
            int r = st2.pop();
            while (!st2.empty()) {
                st1.push(st2.pop());
            }
            return r;
        }
    }
    
    public int peek() {
        if (st1.empty()) {
            return -1;
        } else {
            while (!st1.empty()) {
                st2.push(st1.pop());
            }
            int r = st2.peek();
            while (!st2.empty()) {
                st1.push(st2.pop());
            }
            return r;
        }
    }
    
    public boolean empty() {
        return st1.empty();
    }


    public static void main(String[] a) {
        QueueUsingStack q = new QueueUsingStack();

        q.push(1);
        q.push(2);
        int peek = q.peek();
        System.out.println(peek);
        int pop = q.pop();
        System.out.println(pop);
        
        System.out.println(q.empty());



    }



}
