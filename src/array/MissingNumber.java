package array;

public class MissingNumber {
    public static void main(String[] args) {
        int a[]={1,2,3,5};
        int n = a.length;
        int sum = 0;
        for(int i = 0; i < n - 1; i++)
            sum += a[i];
        System.out.println (((n * (n + 1)) / 2) - sum);
    }
}
