public class q15_Longest_Repeating_Character_Placement {

    public static void main(String[] args) {
        characterReplacement("AABABBB", 1);
    }
    public static int characterReplacement(String s, int k) {
        //初始化variables
        //start作为开始计位置， maxCount为最大重复次数， maxLength为最大重复组的长度
        int start = 0, maxCount = 0, maxLength = 0;
        //计算每个字母出现次数
        int[] count = new int[26];
        for (int end = 0; end<s.length(); end++) {
            char c = s.charAt(end);
            //获取最大重复次数
            maxCount = Math.max(maxCount, ++count[c-'A']);
            //判断是否需要移动开始值
            int replace = end-start+1-maxCount;
            if (replace > k) {
                count[s.charAt(start)-'A']--;
                start++;
            } else {
                maxLength = Math.max(maxLength, end-start+1);
            }
        }
        return maxLength;
    }

    /*

    input = AABABBB
    k = 1

        A. start = 0, end = 0, maxCount = 1, count = 1 (A), maxLength = 1
        A. start = 0, end = 1, maxCount = 2, count = 2 (A), maxLength = 2
        B. start = 0, end = 2, maxCount = 2, count = 1 (B), maxLength = 3
        A. start = 0, end = 3, maxCount = 3, count = 3 (A), maxLength = 4
        B. start = 0, end = 4, maxCount = 3, count = 2 (B), maxLength = 4, count = 2 (A), start++
        B. start = 1, end = 5, maxCount = 3, count = 3 (B), maxLength = 4, count = 1 (A), start++
        B. start = 2, end = 6, maxCount = 4, count = 4 (B), maxLength = 5

     */
}
