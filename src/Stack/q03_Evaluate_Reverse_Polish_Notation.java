package Stack;

import java.util.Stack;

public class q03_Evaluate_Reverse_Polish_Notation {

    public int evalRPN(String[] tokens) {
        int first, second;
        Stack<Integer> stack = new Stack<>();
        for (String s: tokens) {
            if (s.equals("+")) {
                second = stack.pop();
                first = stack.pop();
                stack.push(first+second);
            } else if (s.equals("-")) {
                second = stack.pop();
                first = stack.pop();
                stack.push(first-second);
            } else if (s.equals("*")) {
                second = stack.pop();
                first = stack.pop();
                stack.push(first*second);
            } else if (s.equals("/")) {
                second = stack.pop();
                first = stack.pop();
                stack.push(first/second);
            } else {
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
}
