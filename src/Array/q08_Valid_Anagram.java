package Array;

/*
    https://leetcode.com/problems/valid-anagram/
 */
public class q08_Valid_Anagram {

    public boolean isAnagram(String s, String t) {
        //形成一个alphabet字典
        int[] alphabet = new int[26];
        //计算s的使用字母的数量
        for (char c: s.toCharArray()) { alphabet[c-'a']++; }
        //扣除每个使用的字母数量
        for (char c: t.toCharArray()) { alphabet[c-'a']--; }
        //看是否还有未扣除的字母
        for (int letter: alphabet) {
            if (letter != 0) {
                return false;
            }
        }
        return true;
    }
}
