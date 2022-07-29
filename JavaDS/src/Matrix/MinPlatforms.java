package Matrix;
import java.util.*;

/* Input: arr[] = {9:00, 9:40, 9:50, 11:00, 15:00, 18:00} 
dep[] = {9:10, 12:00, 11:20, 11:30, 19:00, 20:00} 
Output: 3 
Explanation: There are at-most three trains at a time (time between 9:40 to 12:00) */


public class MinPlatforms {
    // O(n3)
    public static int findPlatform(int arr[], int dep[], int n)
    {
 
        // plat_needed indicates number of platforms
        // needed at a time
        int plat_needed = 1, result = 1;
        int i = 1, j = 0;
 
        // run a nested  loop to find overlap
        for (i = 0; i < n; i++) {
            // minimum platform
            plat_needed = 1;
 
            for (j = i + 1; j < n; j++) {
                // check for overlap
                if (Math.max(arr[i], arr[j])
                    <= Math.min(dep[i], dep[j]))
                    plat_needed++;
            }
 
            // update result
            result = Math.max(result, plat_needed);
        }
 
        return result;
    }

    
    // Function to find the minimum number
    // of platforms required O(nlogn)
    static int findPlatform1(int arr[], int dep[], int n)
    {
        // Store the arrival and departure time
        int[][] arr2 = new int[n][2];
 
        for (int i = 0; i < n; i++) {
            arr2[i] = new int[] { arr[i], dep[i] };
        }
 
        // Sort arr2 based on arival time
        Arrays.sort(arr2,
                    (A, B) -> { return A[0] - B[0]; });
        PriorityQueue<Integer> p = new PriorityQueue<>();
 
        int count = 1;
        p.add(arr2[0][1]);
 
        for (int i = 1; i < n; i++) {
 
            // Check if arrival time of current train
            // is less than or equals to departure time
            // of previous train
            if (p.peek() >= arr2[i][0]) {
                count++;
            }
            else {
                p.remove();
            }
            p.add(arr2[i][1]);
        }
 
        // Return the number of platform required
        return count;
    }



 
    // Driver Code
    public static void main(String[] args)
    {
        int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
        int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };
        int n = 6;
        System.out.println(findPlatform(arr, dep, n));
    }
}