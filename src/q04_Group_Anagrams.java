import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class q04_Group_Anagrams {

    public static void main(String[] args) {
        groupAnagrams(new String[]{"ant", "nat", "bac"});
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();

        //使用来存放对应anagram的组
        Map<String, List<String>> tempMap = new HashMap<>();
        for (String s: strs) {
            //计算每个string所使用的字母数量
            char[] chars = new char[26];
            for (char c: s.toCharArray()) {
                chars[c-'a']++;
            }
            String key = new String(chars);
            //若不存在 则创建一个
            tempMap.computeIfAbsent(key, list -> new ArrayList<>());
            //后续才叠加
            tempMap.get(key).add(s);
        }

        res.addAll(tempMap.values());
        return res;
    }
}
