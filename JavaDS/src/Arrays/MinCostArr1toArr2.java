package Arrays;

public class MinCostArr1toArr2 {

     
    // Function to find lower_bound
    static int LowerBound(int a[], int k,
                          int x)
    {
        int l = -1;
        int r = k;
         
        while (l + 1 < r)
        {
            int m = (l + r) >>> 1;
            if (a[m] >= x)
            {
                r = m;
            }
            else
            {
                l = m;
            }
        }
        return r;
    }
       
    // Function to find length of the
    // longest common subsequence
    static int findLCS(int[] nums, int N)
    {
        int k = 0;
        for(int i = 0; i < N; i++)
        {
             
            // Find position where element
            // is to be inserted
            int pos = LowerBound(nums, k,
                                 nums[i]);
            nums[pos] = nums[i];
            if (k == pos)
            {
                k = pos + 1;
            }
        }
         
        // Return the length of LCS
        return k;
    }
     
    // Function to find the minimum cost
    // required to convert the sequence A
    // exactly same as B
    static int  minimumCost(int[] A, int[] B,
                            int M, int N, int C)
    {
         
        // Auxiliary array
        int[] nums = new int[100000];
     
        // Stores positions of elements of A[]
        int[] index = new int[100000];
     
        // Initialize index array with -1
        for(int i = 0; i < 100000; i++)
            index[i] = -1;
             
        for(int i = 0; i < N; i++)
        {
             
            // Update the index array with
            // index of corresponding
            // elements of B
            index[B[i]] = i;
        }
     
        int k = 0;
     
        for(int i = 0; i < M; i++)
        {
             
            // Place only A's array values
            // with its mapped values
            // into nums array
            if (index[A[i]] != -1)
            {
                nums[k++] = index[A[i]];
            }
        }
     
        // Find LCS
        int lcs_length = findLCS(nums, k);
     
        // No of elements to be added
        // in array A[]
        int elements_to_be_added = N - lcs_length;
     
        // Stores minimum cost
        int min_cost = elements_to_be_added * C;
     
        // Print the minimum cost
        System.out.println( min_cost);
        return 0;
    }
     
    // Driver code
    public static void main(String[] args)
    {
         
        // Given array A[]
        int[] A = { 1, 2, 5, 17 };
        int[] B = { 4, 3, 7, 11 };
         
        // Given C
        int C = 2;
         
        // Size of arr A
        int M = A.length;
         
        // Size of arr B
        int N = B.length;
         
        // Function call
        minimumCost(A, B, M, N, C);
    }
}
     