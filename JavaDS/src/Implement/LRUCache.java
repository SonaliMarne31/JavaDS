package Implement;
import java.util.*;

public class LRUCache {
	Set<Integer> cache;
    int capacity;
  
    public LRUCache(int capacity)
    {
        this.cache = new LinkedHashSet<Integer>(capacity);
        this.capacity = capacity;
    }
  
    /* Refers key x with in the LRU cache */
    public void refer(int key)
    {        

        if(!cache.contains(key)) { // does not contain

            if (cache.size() == capacity) { // if full, remove first element
                int firstKey = cache.iterator().next();
                cache.remove(firstKey);
            }
            // add a new element
            cache.add(key);
        } else {
            cache.remove(key);
            cache.add(key);
        }

    }
  
    // displays contents of cache in Reverse Order
    public void display()
    {
      LinkedList<Integer> list = new LinkedList<>(cache);
        
      // The descendingIterator() method of java.util.LinkedList
      // class is used to return an iterator over the elements
      // in this LinkedList in reverse sequential order
      Iterator<Integer> itr = list.descendingIterator(); 
        
      while (itr.hasNext())
            System.out.print(itr.next() + " ");
    }
      
 
    public static void main(String[] args)
    {
        LRUCache ca = new LRUCache(4);
        ca.refer(1);
        ca.refer(2);
        ca.refer(3);
        ca.refer(1);
        ca.refer(4);
        ca.refer(5);
        ca.display();
    }

    
}