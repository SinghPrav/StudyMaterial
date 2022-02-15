package array.sliding;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FirstNegativeNumberInWindow {
    public static void main(String[] args) {
        int arr[] = {-8, 2, 3, -6, 10};
        //-8 0 -6 -6
        int k=2;
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();

        int j=0;
        int i=0;
        while(j<arr.length){
            if(arr[j]<0) {
                queue.add(arr[j]);
            }
            if(j-i+1 < k){
                j++;
            }else if(j-i+1 == k){

                if(queue.size()==0)
                {
                    list.add(0);
                }
                else
                {
                    list.add(queue.peek());
                }
                j++;
                if(arr[i]<0) {
                    queue.poll();
                }
                i++;
            }
        }

        for(int m=0;m<list.size();m++) {
            System.out.print(list.get(m)+" ");
        }

    }

}
