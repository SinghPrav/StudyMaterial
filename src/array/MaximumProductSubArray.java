package array;

public class MaximumProductSubArray {
    public static void main(String ar[]){


        int[]a = {-1, -3, -10, 2, 4, 0, 4, 5};//{6, -3, -10, 0, 2};
        System.out.println("max procut:"+maxProduct(a));


    }
    public static int maxProduct(int[] nums) {

        int max = nums[0], min = nums[0], ans = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int temp = max;  // store the max because before updating min your max will already be updated

            max = Math.max(Math.max(max * nums[i], min * nums[i]), nums[i]);
            min = Math.min(Math.min(temp * nums[i], min * nums[i]), nums[i]);

            if (max > ans) {
                ans = max;
            }
        }

        return ans;

    }
}
