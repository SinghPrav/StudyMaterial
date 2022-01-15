package Stack;

import java.util.Arrays;

public class TargetSum {
    static int  count =0;
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,1,1,1};
        findTargetMemo(arr, 3);
    }

   static int total;

    public static int findTargetMemo(int[] nums, int S) {
        total = Arrays.stream(nums).sum();

        int[][] memo = new int[nums.length][2 * total + 1];
        for (int[] row : memo) {
            Arrays.fill(row, Integer.MIN_VALUE);
        }
        return calculate(nums, 0, 0, S, memo);
    }

    public static int calculate(int[] nums, int i, int sum, int S, int[][] memo) {
        if (i == nums.length) {
            if (sum == S) {
                return 1;
            } else {
                return 0;
            }
        } else {
            if (memo[i][sum + total] != Integer.MIN_VALUE) {
                return memo[i][sum + total];
            }
            int add = calculate(nums, i + 1, sum + nums[i], S, memo);
            int subtract = calculate(nums, i + 1, sum - nums[i], S, memo);
            memo[i][sum + total] = add + subtract;
            return memo[i][sum + total];
        }
    }












    public static int findTargetSumWays(int[] nums, int target) {
        dfs(nums, target, 0, 0);
        System.out.println("Count: "+count);
        return count;
    }

    private static void dfs(int[] nums, int target, int index, int sum){
        if(index == nums.length){
            if(sum == target) {
                count++;
            }
        }else{
            dfs(nums, target, index+1, sum + nums[index]);
            dfs(nums, target, index+1, sum - nums[index]);
        }
    }
}
