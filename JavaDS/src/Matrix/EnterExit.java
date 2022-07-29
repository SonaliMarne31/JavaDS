package Matrix;
import java.util.*;

public class EnterExit {
    // People who logged Exit but didn't log Entry
    private static Set<String> invalidEntrySet = new HashSet<>();
    // People who logged Entry, and later if there are records left in this then they din't log exit
    private static Set<String> validEntrySet = new HashSet<>();
    public static void main(String[] args) {
        String [][]  logs = {
                {"Martha", "exit"},
                {"Paul", "enter"},
                {"Martha", "enter"},
                {"Martha", "exit"},
                {"Jennifer", "enter"},
                {"Paul", "enter"},
                {"Curtis", "exit"},
                {"Curtis", "enter"},
                {"Paul", "exit"},
                {"Martha", "enter"},
                {"Martha", "exit"},
                {"Jennifer", "exit"},
                {"Paul", "enter"},
                {"Paul", "enter"},
                {"Martha", "exit"}
        };
        // Expected output: ["Curtis", "Paul"], ["Martha", "Curtis"]
        for(String[] arr : logs) {
            String name = arr[0];
            String action = arr[1];
            switch (action){
                case "exit":
                    if(validEntrySet.contains(name)) {
                        validEntrySet.remove(name);
                    } else {
                        invalidEntrySet.add(name);
                    }
                    break;
                case "enter":
                    validEntrySet.add(name);
                    break;
            }
        }
        System.out.println("Invalid Entry Set: "+ invalidEntrySet);
        System.out.println("Invalid Exit Set: "+ validEntrySet);
    }
}