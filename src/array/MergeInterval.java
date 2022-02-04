package array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class MergeInterval {
    public static void main(String[] args) {
        Pair [] arr= new Pair[4];
        arr[0]=new Pair(6,8);
        arr[1]=new Pair(1,9);
        arr[2]=new Pair(2,4);
        arr[3]=new Pair(4,7);
        Arrays.sort(arr,new Comparator<Pair>(){
            public int compare(Pair i1,Pair i2)
            {
                return i1.start - i2.start;
            }
        });
        mergeInterval(arr);
    }

     public static void mergeInterval(Pair [] arr){
         Stack<Pair> stack = new Stack<>();
         for(int i=0;i<arr.length;i++){
             if(!stack.isEmpty()){
                 Pair pair = stack.peek();
                 if(pair.end >= arr[i].start){
                     pair.end = Math.max(pair.end, arr[i].end);
                 }else {
                    stack.push(pair);
                 }
             }else {
                 stack.push(arr[i]);
             }
         }

         Stack<Pair> stack1 = new Stack<>();
         while (stack.size()>0){
             stack1.push(stack.pop());
         }
         while (stack1.size()>0){
             Pair top = stack1.pop();
             System.out.println(top);
         }
     }

    static class Pair {
        int start;
        int end;

        public Pair(int start, int end) {
            this.start = start;
            this.end = end;
        }



        @Override
        public String toString() {
            return "Pair{" +
                    "start=" + start +
                    ", end=" + end +
                    '}';
        }
    }
}
