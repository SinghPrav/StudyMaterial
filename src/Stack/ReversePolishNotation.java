package Stack;

import java.util.Stack;

public class ReversePolishNotation {
    public static void main(String[] args) {
        String[] not = { "2","1","+","3","*"};
       System.out.println(rvn(not));
    }

    private static int rvn(String[] token){
        Stack<String> rvn = new Stack<String>();
        for (String s : token) {
                switch (s) {
                    case "+":
                        String a1 = rvn.pop();
                        String a2 = rvn.pop();
                        int add = (Integer.parseInt(a2) + Integer.parseInt(a1));
                        rvn.push(String.valueOf(add));
                        break;
                    case "-":
                        String a3 = rvn.pop();
                        String a4 = rvn.pop();
                        int sub = (Integer.parseInt(a4) - Integer.parseInt(a3));
                        rvn.push(String.valueOf(sub));
                        break;

                    case "*":
                        String a5 = rvn.pop();
                        String a6 = rvn.pop();
                        int mul = (Integer.parseInt(a6) * Integer.parseInt(a5));
                        rvn.push(String.valueOf(mul));
                        break;
                    case "/":
                        String a7 = rvn.pop();
                        String a8 = rvn.pop();
                        int div = (Integer.parseInt(a8) / Integer.parseInt(a7));
                        rvn.push(String.valueOf(div));
                        break;
                    default:
                        rvn.push(s);
                        break;
            }
        }
        return Integer.parseInt(rvn.pop());
    }
}
