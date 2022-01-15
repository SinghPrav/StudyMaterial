package array;

import java.util.Arrays;

public class ChoclateDistributionMinDiffOfRange {
    public static void main(String[] args) {
        int arr[] = {3, 4, 1, 9, 56, 7, 9, 12};
      //  3,4,7,9,9 and the output is 9-3 = 6

        int m = 5;  // Number of students

        int n = arr.length;


        int minDiff = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=0; i+m-1 < n; i++){
            int diff = arr[i+m-1] - arr[i];
            if(diff < minDiff){
                minDiff = diff;
            }
        }
        System.out.println(minDiff);


    }
}
