package Arrays;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
       
        int n = temperatures.length;
        int j = 0;
        for(int i=0; i<n; i++) {
            j = i+1;
            if(i==n) {
                temperatures[i] = 0;
                break;
            }
            while(j<n) {
                if(temperatures[j] > temperatures[i]) {
                    temperatures[i] = j-i;
                    break;
                } else {
                    j++;
                }
            }
            if(j==n) {
                temperatures[i] = 0;
            }
        }
        return temperatures;
    }
}
