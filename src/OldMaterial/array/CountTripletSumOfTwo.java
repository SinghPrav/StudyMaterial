package OldMaterial.array;

public class CountTripletSumOfTwo {
    static int countTriplets(int arr[], int n){
        int []freq = new int[100];

        // Loop to count the frequency
        for (int i = 0; i < n; i++){
            freq[arr[i]]++;
        }
        int count = 0;

        // Loop to count for triplets
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(freq[arr[i] + arr[j]] > 0){
                    count++;
                }
            }
        }
        return count;
    }

    // Driver Code
    public static void main(String[] args)
    {
        int n = 4;
        int arr[] = {1, 5, 3, 2};

        // Function Call
        System.out.print(countTriplets(arr, n));
    }
}
