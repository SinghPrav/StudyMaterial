package OldMaterial.array;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int n = arr.length;

        int right = n-1;
        int left = 0;

        int maxRight = 0;
        int maxLeft = 0;

        int result = 0;

        while(left <= right){
            if(maxRight <= maxLeft){
                result += Math.max(0, maxRight- arr[right]);
                maxRight = Math.max(maxRight, arr[right]);
                right -=1;
            }else {
                result += Math.max(0, maxLeft-arr[left]);
                maxLeft = Math.max(maxLeft, arr[left]);
                left += 1;
            }
        }

        System.out.println("Total water---"+result);

    }
}
