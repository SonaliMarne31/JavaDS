package Matrix;
import java.util.*;

public class BadgeTime2 {


    private void findEmployee(String[][] badge_times) {
        Map<String, List<Integer>> map = new HashMap<>();
    
        for (String[] bt : badge_times) {
            String user = bt[0];
            Integer time = Integer.valueOf(bt[1]);
            map.put(user, map.getOrDefault(user, new ArrayList<>()));
            map.get(user).add(time);
        }
    
        Map<String, List<Integer>> res = new HashMap<>();
        for (String emp : map.keySet()) {
            List<Integer> timestamp = map.get(emp);
            Collections.sort(timestamp);
    
            int start = 0;
            int end = 0;
            for (int i = 0; i < timestamp.size(); i++) {
                // till current time lt eq to start, keep on incrementing end
                // here i am comparing one-hr with 100, because time in 24 hr with string
                // representaion
                // 0 -> 00:00, 210 -> 02:10, 259 -> 02:59, 300 -> 03:00 // so effectively 1 hr
                // can be equivalent to 100
                if (timestamp.get(i) - timestamp.get(start) <= 100)
                    end = i;
                else if (end - start + 1 >= 3) // if we met the condition, we only need to show first occurrence so we
                                                // can break the loop
                    break;
                else {
                    start++; // increment window
                    i--; // this step is done to start from window where all previous condition fails and
                            // start current window from this element
                    // for ex [0, 1909, 1910] -> start = 0, i = 1, condition fails now start = 1 and
                    // i=1, if we don;t decrement i, then for false condition, that element will be
                    // missed
                }
            }
            
            // Add result for each person who has 3 or more logins in one hour
            if (end - start + 1 >= 3) {
                res.put(emp, new ArrayList<>());
                for (int i = start; i <= end; i++) {
                    res.get(emp).add(timestamp.get(i));
                }
            }
    
        }
    
        System.out.println(res.toString());
    }


    public static void main(String[] args) {

		String[][] badgeTimes = new String[][] { { "Paul", "1355" }, { "Jennifer", "1910" }, { "Jose", "835" },
			{ "Jose", "830" }, { "Paul", "1315" }, { "Chloe", "0" }, { "Chloe", "1910" }, { "Jose", "1615" },
			{ "Jose", "1640" }, { "Paul", "1405" }, { "Jose", "855" }, { "Jose", "930" }, { "Jose", "915" },
			{ "Jose", "730" }, { "Jose", "940" }, { "Jennifer", "1335" }, { "Jennifer", "730" }, { "Jose", "1630" },
			{ "Jennifer", "5" }, { "Chloe", "1909" }, { "Zhang", "1" }, { "Zhang", "10" }, { "Zhang", "109" },
			{ "Zhang", "110" }, { "Amos", "1" }, { "Amos", "2" }, { "Amos", "400" }, { "Amos", "500" },
			{ "Amos", "503" }, { "Amos", "504" }, { "Amos", "601" }, { "Amos", "602" }, { "Paul", "1416" }, };

            BadgeTime2 b = new BadgeTime2();
            b.findEmployee(badgeTimes);

    }
}
