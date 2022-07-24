package Backtracking;

/*
    https://leetcode.com/problems/palindrome-partitioning/
 */

import java.util.*;

public class q06_Palindrome_Partitioning {

    public List<List<String>> partition(String s) {
        List<List<String>> resList = new ArrayList<>();
        backTracking(resList, new ArrayList<>(), s, 0);
        return resList;
    }

    public void backTracking(List<List<String>> list, List<String> tempList, String s, int current) {
        if (current == s.length()) {
            list.add(new ArrayList<>(tempList));
        }
        else {
            for (int i = current; i < s.length(); i++) {
                if (isPal(s, current, i)) {
                    tempList.add(s.substring(current, i+1));
                    backTracking(list, tempList, s, i+1);
                    tempList.remove(tempList.size()-1);
                }
            }
        }
    }

    public boolean isPal(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) { return false; }
        }
        return true;
    }
}
