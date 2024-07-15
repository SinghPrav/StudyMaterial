package OldData.OldMaterial.array.sliding;

public class MinSizeSubArray {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5};
        System.out.println(minSubArrayLen(11, nums));
    }
    public static int minSubArrayLen(int target, int[] nums) {

        int i = 0;
        int j = nums.length;
        int sum = 0;
        int maxLength = Integer.MAX_VALUE;

        for (int d = 0; d < j; d++) {
            sum += nums[d];
            while (sum >= target) {
                maxLength = Math.min(maxLength, d + 1 - i);
                System.out.println("value:" + maxLength);
                sum -= nums[i++];
            }
        }
        return (maxLength != Integer.MAX_VALUE ? maxLength : 0);
    }
}
