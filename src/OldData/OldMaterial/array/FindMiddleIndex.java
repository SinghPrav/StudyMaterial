package OldData.OldMaterial.array;

import java.util.Arrays;

public class FindMiddleIndex {
    public static void main(String[] args) {
        int nums []= {1,2,3,4,3,2,1};
        int leftSum = 0, total = Arrays.stream(nums).sum();
        int out =-1;
        for (int i = 0; i < nums.length; i++) {
            if (2*leftSum == total - nums[i]){
                out =i;
                break;
            }
            leftSum += nums[i];
        }
        System.out.println(out);
    }

}
