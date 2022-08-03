package Sliding_Window;

/*
    https://leetcode.com/problems/find-all-anagrams-in-a-string/
 */

import java.util.*;

public class q06_Find_All_Anagrams_in_a_String {

    public List<Integer> findAnagrams(String s, String t) {
        List<Integer> resList = new ArrayList<>();

        Map<Character, Integer> map = new HashMap<>();
        for (char c: t.toCharArray()) { map.put(c, map.getOrDefault(c,0)+1); }

        int end = 0, start = 0, counter = map.size();
        while (end < s.length()) {
            char c = s.charAt(end);
            if (map.containsKey(c)) {
                map.put(c, map.get(c)-1);
                if (map.get(c) == 0) { counter--; }
            }
            end++;

            while (counter == 0) {
                char ch = s.charAt(start);
                if (map.containsKey(ch)) {
                    map.put(ch, map.get(ch)+1);
                    if (map.get(ch) > 0) { counter++; }
                }

                if (end-start == t.length()) { resList.add(start); }
                start++;
            }
        }
        return resList;
    }

    /*
        Since have to find all the anagrams from s based on the t string.
            Hence, find the chars exist in t.
            Then, use the sliding window method to see if every char in s satisfied.
            If end-start == t.length(), meaning is an anagram.
            when the counter hits 0, meaning have to slide the start to the next char of the s.
     */
}
