package Sliding_Window;

import java.util.HashMap;
import java.util.Map;

public class q02_Longest_Substring_Without_Repeating_Characters {

    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        Map<Character,Integer> map = new HashMap<>();
        for (int i=0, j=0; i<s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                j = Math.max(j, map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i-j+1);
        }
        return max;
    }
}
