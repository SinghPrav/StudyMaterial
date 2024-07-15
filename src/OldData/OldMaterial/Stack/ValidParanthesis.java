package OldData.OldMaterial.Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        Map<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(')', '(');
        map.put(']', '[');

        String s ="([)]";

        Stack<Character> stack = new Stack<>();
        int l = s.length();
        int i=0;
        boolean isValid = true;
        while(i < l){
            char paranth = s.charAt(i);
            if(map.containsKey(paranth)){
                char top = stack.empty()? '#' : stack.pop();
                if(top != map.get(paranth)){
                    isValid = false;
                    break;
                }
            }else {
            stack.push(s.charAt(i));
            }
            i++;
        }
    System.out.println(isValid);
    }
}
