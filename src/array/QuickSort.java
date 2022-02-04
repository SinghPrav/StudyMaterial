package array;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 10, 7, 8, 3, 1, 5 };
        int n = arr.length;
        quickSort(arr, 0, n-1);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }

    public static void quickSort(int a[], int low, int high){
         if (low < high){
             int pi = partition(a, low, high);
             quickSort(a,low, pi-1);
             quickSort(a, pi+1, high);
         }
    }

    public static int partition(int a[], int low, int high){
        int pivot = a[high];
        int i=(low-1);
        for(int j=low; j<high; j++){
            if(a[j] < pivot){
                i++;
                swap(a, i, j);
            }
        }
        swap(a, i+1, high);
        return (i+1);
    }

    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void printArray(int[] arr, int size)
    {
        for(int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }


}
