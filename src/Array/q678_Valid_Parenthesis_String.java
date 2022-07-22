package Array;/*
    https://leetcode.com/problems/valid-parenthesis-string/
 */

public class q678_Valid_Parenthesis_String {

    public boolean checkValidString(String s) {
        int cmin = 0, cmax = 0;

        for (char c: s.toCharArray()) {
            if (c == '(') {
                cmin++;
                cmax++;
            }
            else if (c == ')') {
                cmin--;
                cmax--;
            }
            else if (c == '*') {
                cmin--;
                cmax++;
            }

            if (cmax < 0) { return false; }

            cmin = Math.max(cmin, 0);
        }
        return cmin == 0;
    }
}
