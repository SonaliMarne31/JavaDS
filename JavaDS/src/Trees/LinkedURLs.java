package Trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LinkedURLs {

    private static boolean checkIfURLAreLinked(Map<String, String> map, String start, String end) {
        return true;
    }
    
    public static void main(String[] aStrings) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("\\/", null);
        map.put("\\/", "\\/");
        map.put("\\/search", "\\/");
        map.put("\\/detail", "\\/search");
        map.put("\\/reviews", "\\/detail");
        map.put("\\/help", "\\/");
        map.put("\\/", "\\/search");
        map.put("\\/cart", "\\/detail");
        map.put("\\/cart", "\\/search");
        map.put("\\/robots.txt ", null);

        LinkedURLs l = new LinkedURLs();
        String start = "\\/";
        String end = "\\/search";

        boolean areLinked = l.checkIfURLAreLinked(map, start, end);
        System.out.println("Linked ? " + areLinked);


    }

}
