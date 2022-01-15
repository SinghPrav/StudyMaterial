package array;

public class LargestElementInArray {
    public static void main(String ar[])
    {
        int  arr[]={1, 8, 97, 56, 90};
        int n = 5;
        int bigNum =0;
        for(int i=0;i<arr.length; i++){
            if(bigNum< arr[i]){
                bigNum = arr[i];
            }
        }
        System.out.println("Number is: "+bigNum);
    }
}
