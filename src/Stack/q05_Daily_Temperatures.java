package Stack;

import java.util.Stack;

public class q05_Daily_Temperatures {

    public static int[] dailyTemperatures(int[] temperatures) {
        // calculate the days needed
        int[] res = new int[temperatures.length];
        // store index
        Stack<Integer> stack = new Stack<>();

        for (int i=0; i<temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]) {
                int tempIndex = stack.pop();
                res[tempIndex] = i - tempIndex;
            }
            stack.push(i);
        }
        return res;
    }
}
