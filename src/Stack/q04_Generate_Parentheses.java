package Stack;

import java.util.ArrayList;
import java.util.List;

public class q04_Generate_Parentheses {

    public static void main(String[] args) {
        System.out.println(generateParentheses(3));
    }

    public static List<String> generateParentheses(int n) {
        List<String> resultList = new ArrayList<>();
        backTracking(resultList, "", 0, 0, n);
        return resultList;
    }

    public static void backTracking(List<String> list, String str, int open, int close, int max){
        if (str.length() == max*2) {
            list.add(str);
            return;
        }

        if (open < max) {
            backTracking(list, str+"(", open+1, close, max);
        }
        if (close < open) {
            backTracking(list, str+")", open, close+1, max);
        }
    }
}
