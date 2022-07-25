package Matrix;
import java.util.*;

public class MeetingScheduler {
    // Given the availability time slots arrays slots1 and slots2 of two people and a meeting duration duration, return the earliest time slot that     works for both of them and is of duration duration.
    // Time complexity: O((M+N) \log (M+N))O((M+N)log(M+N)), when MM is the length of slots1 and NN is the length of slots2.
    public List<Integer> minAvailableDuration(int[][] slots1, int[][] slots2, int duration) {
        
        PriorityQueue<int[]> timeslots = new PriorityQueue<>((slot1, slot2) -> slot1[0] - slot2[0]);

        for (int[] slot: slots1) {
            if (slot[1] - slot[0] >= duration) timeslots.offer(slot);
        }
        for (int[] slot: slots2) {
            if (slot[1] - slot[0] >= duration) timeslots.offer(slot);
        }

        while (timeslots.size() > 1) {
            int[] slot1 = timeslots.poll();
            int[] slot2 = timeslots.peek();
            if (slot1[1] >= slot2[0] + duration) {
                return new ArrayList<Integer>(Arrays.asList(slot2[0], slot2[0] + duration));
            }
        }
        return new ArrayList<Integer>();
    }


    // Given an array of meeting time intervals intervals where intervals[i] = [starti, endi], return the minimum number of conference rooms required.
    //  O(nlogn)
    public int minMeetingRooms(int[][] intervals) {
        int n = intervals.length;
		int[] startTimes = new int[n];
		int[] endTimes = new int[n];
		for (int i = 0; i < n; ++i) {
			startTimes[i] = intervals[i][0];
			endTimes[i] = intervals[i][1];
		}

		Arrays.sort(startTimes);
		Arrays.sort(endTimes);
		int ret = 0;
		int j = 0;
		for (int i = 0; i < n; ++i) {
			if (startTimes[i] < endTimes[j]) {
				++ret;
			} else {
				++j;
			}
		}
		return ret;
    }

    // Given an array of meeting time intervals where intervals[i] = [starti, endi], determine if a person could attend all meetings.
    // O(n2)
    public boolean canAttendMeetings(int[][] intervals) {
        for (int i = 0; i < intervals.length; i++) {
            for (int j = i + 1; j < intervals.length; j++) {
                if (overlap(intervals[i], intervals[j])) {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean overlap(int[] interval1, int[] interval2) {
        return (Math.min(interval1[1], interval2[1]) >
                Math.max(interval1[0], interval2[0]));
    }
    
    
    // O(nlon)
    public boolean canAttendMeetings1(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        for (int i = 0; i < intervals.length - 1; i++) {
            if (intervals[i][1] > intervals[i + 1][0]) {
                return false;
            }
        }
        return true;
    }

}
