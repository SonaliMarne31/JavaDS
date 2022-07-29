package Matrix;

import java.util.HashMap;

public class MergeIntervals {
	HashMap<Integer, Integer> hm = new HashMap<>();
    public int[][] merge(int[][] intervals) {
        
        int R = intervals.length;
        int C = 2;
        
        for(int i=0; i<R ; i++) {
            hm.put(intervals[i][0], intervals[i][1]);
        }
        
        for(int i=0; i<R-1; i++) {
            if (intervals[i][1] > intervals[i+1][0]) {
            	hm.remove(intervals[i+1][0]);
                hm.put(intervals[i][0], intervals[i+1][1]);
            }
        }
        int size = hm.size();
        int[][] updated = new int[size][C];
        int i=0;
        for(Integer k: hm.keySet()) {
        	updated[i][0] = k;
            updated[i][1] = hm.get(k);
            i++;
        }
        
        return updated;
        
	}
	public static void main(String[] args) {
		MergeIntervals m = new MergeIntervals();
//		int[][] a = new int[][] {{1,3}, {2,6}, {8, 10} , {15, 18}};
		int[][] a = new int[][] {{1,4}, {1,4}};
		m.merge(a);
	}

}
