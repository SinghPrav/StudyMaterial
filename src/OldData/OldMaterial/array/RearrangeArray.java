package OldData.OldMaterial.array;

public class RearrangeArray {
    public static void main(String[] args) {
        int arr[] = {3, 0, 5, 1, 4 ,6, 2};
        //1 3 6 0 4 2 5
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int val = arr[i]+(arr[arr[i]]%n)*n;   //old value->%n  // new value /n
            arr[i] = val;
        }

        // Second Step: Divide all values by n
        for (int i = 0; i < n; i++)
            arr[i] /= n;

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
