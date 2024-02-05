package OldMaterial.array;

import java.util.Arrays;

public class FindDuplicate {
    public static void main(String[] args) {
        int a[] = {2,1,3,2};
       // int a[] = {2,4,3,5,15,6,20,6};
        int sum =0;
        int n = a.length;
       // forAirthmaticSeries(a, sum, n);
        forNormalArray(a, sum, n);

    }

    static void forNormalArray(int a[], int sum, int n){
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            System.out.println("Sorted : "+a[i]);
        }
        int prev =-1;
        int index = -1;
        for(int i=0;i<a.length;i++){
            if(prev == a[i]){
                index = Math.max(index, i);
            }
            prev = a[i];
        }
        System.out.println("Index : "+a[index]);

    }


    static void forAirthmaticSeries(int a[], int sum, int n){
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        int formula = n*(n-1)/2;
        System.out.println("final out put: "+(formula-sum));
    }
}
