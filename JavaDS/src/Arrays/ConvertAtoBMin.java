package Arrays;

public class ConvertAtoBMin {

// Java implementation to find the
// minimum number of operations in
// which the array A can be converted
// to another array B
 
    // Function to find the minimum
    // number of operations in which
    // array A can be converted to array B
    static void checkArray(int a[], int b[], int n)
    {
        int operations = 0;
        int i = 0;
         
        // Loop to iterate over the array
        while (i < n) {
             
            // if both elements are equal
            // then move to next element
            if (a[i] - b[i] == 0) {
                i++;
                continue;
            }
     
            // Calculate the difference
            // between two elements
            int diff = a[i] - b[i];
            i++;
     
            // loop while the next pair of
            // elements have same difference
            while (i < n &&
               a[i] - b[i] == diff) {
                i++;
            }
     
            // Increase the number of
            // operations by 1
            operations++;
        }
     
        // Print the number of
        // operations required
        System.out.println(operations);
    }
     
    // Driver Code
    public static void main (String[] args)
    {
        int a[] = { 1, 2, 5, 17 };
        int b[] = { 4, 3, 7, 11 };
        int size = a.length;
     
        checkArray(a, b, size);
    }
}
