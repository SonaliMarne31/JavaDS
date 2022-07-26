package Strings;
import java.util.*;

public class MatchingStrings {
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // Write your code here
        HashMap<String, Integer> hm = new HashMap<>();
        List<Integer> ll = new ArrayList<>();
        
        for(int i=0; i<strings.size(); i++) {
            if(hm.containsKey(strings.get(i))){
                int nn = hm.get(strings.get(i));
                hm.put(strings.get(i), nn + 1);
            } else {
                hm.put(strings.get(i), 1);
            }
        }
        
        for(int i=0; i<queries.size(); i++) {
            if(hm.containsKey(queries.get(i))) {
                ll.add(i, hm.get(queries.get(i)));
            } else {
                ll.add(0);
            }
        }
        return ll;

    }
    public static void main(String args[]) {
        List<String> strings = new ArrayList<>();
        strings.add("aba");
        strings.add("baba");
        strings.add("aba");
        strings.add("xzxb");

        List<String> lq = new ArrayList<>();
        lq.add("aba");
        lq.add("xzxb");
        lq.add("ab");

        List<Integer> ll = MatchingStrings.matchingStrings(strings, lq);
        System.out.println(ll);

    }
}
