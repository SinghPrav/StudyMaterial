package array;

import java.util.HashMap;
import java.util.Map;

//Find the c

public class LargestSubArraySum0 {
    public static void main(String ar[]){
        int a[] = {15, -2, 2, -8, 1, 7, 10, 23};
        getMaxLength(a);
        sumZero(a);

    }
    private static void getMaxLength(int a[]){
        int sum = 0;
        int maxLength = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<a.length;i++){

            sum += a[i];

            if(sum == 0 && maxLength == 0){
                maxLength = 1;
            }

            if(sum == 0){
                maxLength = i+1;
            }

            Integer prev = map.get(sum);
                if(prev != null){
                    maxLength = Math.max(maxLength, i - prev);
                }else {
                    map.put(sum, i);
                }
        }

        System.out.println("Max length : "+maxLength);

    }



    // int a[] = {15, -2, 2, -8, 1, 7, 10, 23};
    private static void sumZero(int a[]) {
        int l = a.length;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0; i< l;i++){
            sum+=a[i];

            if(map.containsKey(sum)){
                int d = map.get(sum);
                max = Math.max(max, i-d);
            }else {
                map.put(sum, i);
            }
        }
        System.out.println("Max length : "+max);
    }
}




