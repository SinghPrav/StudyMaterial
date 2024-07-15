package OldData.OldMaterial.array;

public class RearrangeArrayInMaxMin {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 4, 5, 6 };
        //arr[] = {6, 1, 5, 2, 4, 3}
        int n = arr.length;
        int max_ele = arr[n - 1];
        int min_ele = arr[0];
        // traverse OldData.OldMaterial.array elements
        for (int i = 0; i < n; i++) {
            // at even index : we have to put maximum element
            if (i % 2 == 0) {
                arr[i] = max_ele;
                max_ele -= 1;
            }

            // at odd index : we have to put minimum element
            else {
                arr[i] = min_ele;
                min_ele += 1;
            }
        }

    }
}
