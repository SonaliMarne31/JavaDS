package Implement;
import java.util.*;


/* Design a HashSet without using any built-in hash table libraries.

Implement MyHashSet class:

void add(key) Inserts the value key into the HashSet.
bool contains(key) Returns whether the value key exists in the HashSet or not.
void remove(key) Removes the value key in the HashSet. If key does not exist in the HashSet, do nothing.
 */
public class HashSet {
    class MyHashSet {
        ArrayList<LinkedList<Integer>> list;
            int size = 100;
        
            public MyHashSet() {
                list = new ArrayList<>(size);
                for (int i = 0; i < size; i++) {
                    list.add(new LinkedList<Integer>());
                }
            }
        
            public int hash(int key) {
                return key % list.size();
            }
        
            public int search(int key) {
                int i = hash(key);
        
                LinkedList<Integer> temp = list.get(i);
                int ans = -1;
        
                for (int j = 0; j < temp.size(); j++) {
                    if (key == temp.get(j)) {
                        return j;
                    }
                }
                return ans;
            }
        
            public void add(int key) {
                if (search(key) == -1) {
                    int i = hash(key);
                    list.get(i).add(key);
                }
            }
        
            public void remove(int key) {
                if (search(key) != -1) {
                    int i = hash(key);
                    list.get(i).remove(Integer.valueOf(key));
                }
            }
        
            public boolean contains(int key) {
                return search(key) != -1;
            }
        }
        
        /**
         * Your MyHashSet object will be instantiated and called as such:
         * MyHashSet obj = new MyHashSet();
         * obj.add(key);
         * obj.remove(key);
         * boolean param_3 = obj.contains(key);
         */
}
