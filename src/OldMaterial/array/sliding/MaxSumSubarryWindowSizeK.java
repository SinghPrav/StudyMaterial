package OldMaterial.array.sliding;

public class MaxSumSubarryWindowSizeK {
    public static void main(String[] args) {
        int a[] = {100, 200, 300, 400};
        int max = maxSubArray(a);
        System.out.println(max);
    }

    static int maxSubArray(int a[]){
        int sum =0;
        int size= a.length;
        int j=0;
        int i=0;
        int k=2;
        int max =0;
        while (j < size){
            if(j-i+1 <= k){
                sum+=a[j];
                j++;
            }else {
                sum -=a[i];
                i++;
            }

            if(max< sum){
                max = sum;
            }
        }

        return max;
    }
}
