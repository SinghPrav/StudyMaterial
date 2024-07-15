package OldData.OldMaterial.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NextGreaterNum {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
      //  int a[] = {1,3,2,4};
        int a[] = {1,3,0,0,1,2,4};
        Stack<Integer> stack = new Stack<>();

        for(int i=a.length-1; i>=0;i--){
            if(stack.size() == 0){
                list.add(-1);
            }else if(stack.peek() > a[i]){
                list.add(stack.peek());
            } else if(!stack.empty() && stack.peek() <= a[i]) {
                while (!stack.empty() && stack.peek() <= a[i]) {
                    stack.pop();
                }
                if(stack.isEmpty()){
                    list.add(-1);
                }else {
                    list.add(stack.peek());
                }
            }
            stack.push(a[i]);
        }
       for(int j=list.size()-1;j>=0;j--){
           System.out.print(list.get(j));
       }
    }
}
