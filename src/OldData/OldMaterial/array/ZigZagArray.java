package OldData.OldMaterial.array;

import java.util.Arrays;

public class ZigZagArray {
    public static void main(String[] args) {
         int arr[] = new int[]{4, 3, 7, 8, 6, 2, 1};
         //3  7  4  8  2  6  1
        boolean flag = true;

        int temp =0;

        for (int i=0; i<=arr.length-2; i++)
        {
            if (flag) /* "<" relation expected */
            {
                /* If we have a situation like A > B > C,
                we get A > B < C by swapping B and C */
                if (arr[i] > arr[i+1])
                {
                    // swap
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }

            }
            else /* ">" relation expected */
            {
                /* If we have a situation like A < B < C,
                we get A < C > B by swapping B and C */
                if (arr[i] < arr[i+1])
                {
                    // swap
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            flag = !flag; /* flip flag */
        }
        System.out.println(Arrays.toString(arr));
    }
}
