package array;

public class SecondHighest {
    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34, 1};
        secondHighestNumber(arr);
    }

    public static void secondHighestNumber(int a[]){
        int first = a[0];
        int second = a[1];
        if(first < second) {
            first = second;
            second = a[0];
        }

        for(int i=2; i < a.length;i++){
            if(first < a[i]){
                second = first;
                first = a[i];
            }else if(second < a[i] && a[i] !=first){
                second = a[i];
            }
        }
        System.out.println("Result second highest:- "+second);

    }
}
