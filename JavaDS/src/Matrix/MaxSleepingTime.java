package Matrix;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class MaxSleepingTime {

    
    private static int maxSleepTime(List<String> meetings) throws ParseException {

        String begin = "Mon 00:00-00:00";
        String end = "Sun 24:00-24:00";

        meetings.add(0, begin);
        meetings.add(end);
        int max = Integer.MIN_VALUE;

        SimpleDateFormat format = new SimpleDateFormat("E, HH:mm");


        for(int i=1; i<meetings.size() ; i++) {

            String prevDay = meetings.get(i-1).substring(0,3);
            String currDay = meetings.get(i).substring(0,3);

            String prevEndTime = meetings.get(i-1).split("-")[1];
            String currStartTime = meetings.get(i).split("-")[0].split(" ")[1];

            Date date1 = format.parse(prevDay + ", " + prevEndTime);
            Date date2 = format.parse(currDay + ", " + currStartTime);

            long diff = date2.getTime() - date1.getTime();
           
            long minutes = TimeUnit.MILLISECONDS.toMinutes(diff);

            max = Math.max(max, (int)minutes);
            
        }

        return max;
    }


    public static void main(String[] args) {

        List<String> meetings = new ArrayList<String>();
        // meetings.add("Mon 01:00-23:00");
        // meetings.add("Tue 01:00-23:00");
        // meetings.add("Wed 01:00-23:00");
        // meetings.add("Thu 01:00-23:00");
        // meetings.add("Fri 01:00-23:00");
        // meetings.add("Sat 01:00-23:00");
        // meetings.add("Sun 01:00-21:00");


        meetings.add("Mon 05:00-13:00");
        meetings.add("Mon 15:00-21:00");
        meetings.add("Tue 03:30-18:15");
        meetings.add("Tue 19:00-20:00");
        meetings.add("Wed 04:25-15:14");
        meetings.add("Wed 15:14-22:40");
        meetings.add("Thu 00:00-23:59");
        meetings.add("Fri 05:00-10:00");
        meetings.add("Fri 16:30-23:50");
        meetings.add("Sat 02:00-06:00");
        meetings.add("Sat 10:00-24:00");
        meetings.add("Sun 01:00-04:00");
        meetings.add("Sun 10:00-20:00");

        
        try {
            int max = MaxSleepingTime.maxSleepTime(meetings);
            System.out.println(max);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        


    }

}
