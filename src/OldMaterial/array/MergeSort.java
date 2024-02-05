package OldMaterial.array;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = { 8, 4, 2, 1 };

        System.out.println("Given Array");
        printArray(arr);

        MergeSort ob = new MergeSort();
       int count = ob.sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted OldMaterial.array-> Swap " + count);
        printArray(arr);

    }

    static void printArray(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();

    }

    public int sort(int arr[], int l, int r){
        int count = 0;
        if(l < r) {
            int m = l + (r - l) / 2;
            count+= sort(arr, l, m);
            count +=sort(arr, m + 1, r);
            count +=mergeSorted(arr, l, m, r);
        }
        return count;
    }

    public int mergeSorted(int arr[], int l, int m, int r){

        int n1 = m - l+1;
        int n2 = r-m;
        int L[] = new int[n1];
        int R[]= new int[n2];
        for (int i=0 ;i< n1;i++){   //L[]= arr[L=0+i], L=5+i
            L[i] = arr[l+i];
        }
        for (int i=0 ;i< n2;i++){   //R[]= arr[R=5+1+i], R=10+1+i
            R[i] = arr[m+1+i];
        }
        int a=0,b=0;
        int k = l;
        int swap =0;
        while (n1 > a && n2> b){
            if(L[a] <= R[b]){
                arr[k] = L[a];
                a++;
            }else{
                arr[k] = R[b];
                b++;
                swap+=(m+1) - l+a;
            }
            k++;
        }

        while (n1 > a){
           arr[k] = L[a];
           a++;
           k++;
        }
        while (n2>b){
        arr[k] = R[b];
        b++;
        k++;
        }

        return swap;
    }
}
