package OldData.OldMaterial.array;

public class ElementApearOnce {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 4, 4, 5, 5, 6, 6 };
        int len = arr.length;

        search(arr, len);
    }
    static void search(int arr[], int n) {
        int XOR = 0;
        for (int i = 0; i < n; i++) {
            XOR = XOR ^ arr[i];
            System.out.println("-- " + XOR);
        }
        System.out.println("The required element is " + XOR);
    }
}
