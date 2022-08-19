package Arrays;
import java.util.*;

public class GetAllIps {
    // assume startIP is smaller than endIP, and inputs are always valid IPs
    public static List<String> findAllIPAdresses(String start, String end) {
        List<String> list = new ArrayList<>();
        String[] arrIP = start.split("\\.");
        int[] arrStart = new int[]{Integer.parseInt(arrIP[0]),Integer.parseInt(arrIP[1]),Integer.parseInt(arrIP[2]),Integer.parseInt(arrIP[3]) };

        String[] arrIPend = end.split("\\.");
        int[] arrEnd = new int[]{Integer.parseInt(arrIPend[0]),Integer.parseInt(arrIPend[1]),Integer.parseInt(arrIPend[2]),Integer.parseInt(arrIPend[3]) };

        while (true){
            if (arrStart[3]>255) {
                arrStart[3] = 0;
                arrStart[2]++;
            }

            if (arrStart[2]>255) {
                arrStart[2] = 0;
                arrStart[1]++;
            }

            if (arrStart[1]>255) {
                arrStart[1] = 0;
                arrStart[0]++;
            }

            list.add(new String(arrStart[0] + "." + arrStart[1] + "." +arrStart[2] + "." +arrStart[3] ));

            if (arrStart[0]==arrEnd[0] && arrStart[1]==arrEnd[1] && arrStart[2]==arrEnd[2] && arrStart[3]==arrEnd[3]) break;

            arrStart[3]++;
        }

        // System.out.println(list);
        return list;
    }

    public static void main(String args[]) {
        List<String> list = GetAllIps.findAllIPAdresses("192.168.0.254", "192.168.1.2");
        System.out.println(list);

    }
}
