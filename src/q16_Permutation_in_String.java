import java.util.Arrays;

public class q16_Permutation_in_String {

    public boolean checkInclusion(String s1, String s2) {
        int[] count = new int[26];
        for (char c: s1.toCharArray()) { count[c-'a']++; }

        int start = 0;
        for (int end=0; end<s2.length(); end++) {
            char c = s2.charAt(end);
            count[c-'a']--;

            while (count[c-'a'] < 0) {
                count[s2.charAt(start)-'a']++;
                start++;
            }
            if (end-start+1 == s1.length()) { return true; }
        }
        return false;
    }
}
