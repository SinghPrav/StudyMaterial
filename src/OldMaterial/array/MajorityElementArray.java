package OldMaterial.array;

import java.util.Arrays;

public class MajorityElementArray {
    public static void main(String[] args) {
        int a[]={3, 3, 4, 2, 4, 4, 2, 4, 4};
        System.out.println("Result ->"+findMajorityElement(a, a.length));

    }

    public static int findMajorityElement(int a[], int n){
        int count = 1;
        int ele = 0;
        int maxNum = -1;
        int temp =a[0];
        Arrays.sort(a);
        int flag = 0;
        for(int i=1;i< a.length;i++){
            if(temp == a[i]){
                count++;
            }else {
                count = 1;
                temp =a[i];
            }
            if(maxNum < count){
                maxNum = count;
                ele =a[i];
                if(maxNum > n/2){
                    flag =1;
                    break;
                }
            }
        }
       return (flag == 1? ele:-1);
    }
}
