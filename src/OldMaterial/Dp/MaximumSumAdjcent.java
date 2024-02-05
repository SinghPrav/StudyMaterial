package OldMaterial.Dp;

public class MaximumSumAdjcent {
    public static void main(String[] args) {
        int[] arr = {5, 5, 10, 100, 10, 5};
        int n = 6;

        // calling function FindMaxSum()
        System.out.println(FindMaxSum(arr,n));
    }

    static int FindMaxSum(int[] arr, int n)
    {
        int[]dp = new int [n];
        if(n == 1)
        {
            return arr[0];
        }
        else if(n == 2)
        {
            return Math.max(arr[0], arr[1]);

        }
        else if(n == 3)
        {
            dp[0] = arr[0];
            dp[1] = arr[1];
            dp[2] = arr[2] + arr[0];
            return Math.max(dp[2], dp[0]);
        }
        else
        {
            dp[0] = arr[0];
            dp[1] = arr[1];
            dp[2] = arr[2] + arr[0];
            for(int i = 3; i < n; i++)
            {
                dp[i] = arr[i] + Math.max(dp[i - 2], dp[i - 3]);
            }
            return Math.max(dp[n - 1], dp[n - 2]);

        }

    }
}
