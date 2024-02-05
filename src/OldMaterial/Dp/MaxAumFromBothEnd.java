package OldMaterial.Dp;

public class MaxAumFromBothEnd {
    static int maxSum(int arr[], int K,
                      int start, int end,
                      int max_sum)
    {
        // Base case
        if (K == 0)
            return max_sum;

        // Pick the start index
        int max_sum_start = max_sum + arr[start];

        // Pick the end index
        int max_sum_end = max_sum + arr[end];

        // Recursive function call
        int ans = Math.max(maxSum(arr, K - 1, start + 1,
                        end, max_sum_start),
                maxSum(arr, K - 1, start,
                        end - 1, max_sum_end));

        // Return the final answer
        return ans;
    }

    // Function to find the maximized sum
    static void maximizeSum(int arr[], int K, int n)
    {
        int max_sum = 0;
        int start = 0;
        int end = n - 1;
        System.out.println(maxSum(arr, K, start, end, max_sum));
    }

    // Driver code
    public static void main(String[] args)
    {
        int arr[] = { 8, 4, 4, 8, 12, 3, 2, 9 };
        int K = 3;
        int n = arr.length;
        maximizeSum(arr, K, n);
    }
}
