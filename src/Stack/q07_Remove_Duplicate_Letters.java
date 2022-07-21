package Stack;
/*
    https://leetcode.com/problems/remove-duplicate-letters/
 */

import java.util.*;

public class q07_Remove_Duplicate_Letters {

    public String removeDuplicateLetters(String s) {
        int[] chars = new int[26];
        boolean[] visited = new boolean[26];
        for (char c: s.toCharArray()) { chars[c-'a']++; }

        Stack<Character> stack = new Stack<>();
        for (char c: s.toCharArray()) {
            chars[c-'a']--;

            if (visited[c-'a']) continue;

            while (!stack.isEmpty() && c < stack.peek() && chars[stack.peek()-'a'] != 0) {
                visited[stack.pop()-'a'] = false;

            }
            stack.push(c);
            visited[c-'a'] = true;
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.insert(0, stack.pop());
        }
        return sb.toString();
    }
}
