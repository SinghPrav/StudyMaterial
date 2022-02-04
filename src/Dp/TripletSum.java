package Dp;

import java.util.HashSet;

public class TripletSum {
    static boolean find3Numbers(int A[], int arr_size, int sum)
    {
        // Fix the first element as A[i]
        for (int i = 0; i < arr_size - 2; i++) {

            // Find pair in subarray A[i+1..n-1]
            // with sum equal to sum - A[i]
            HashSet<Integer> s = new HashSet<Integer>();
            int curr_sum = sum - A[i];
            for (int j = i + 1; j < arr_size; j++)
            {
                if (s.contains(curr_sum - A[j]))
                {
                    System.out.printf("Triplet is %d, %d, %d", A[i], A[j], curr_sum - A[j]);
                    System.out.println();

                }
                s.add(A[j]);
            }
        }

        // If we reach here, then no triplet was found
        return false;
    }

    /* Driver code */
    public static void main(String[] args)
    {
        int A[] = { 0, -1, 2, -3, 1 };
        int sum = 0;
        int arr_size = A.length;

        find3Numbers(A, arr_size, sum);
    }

}
