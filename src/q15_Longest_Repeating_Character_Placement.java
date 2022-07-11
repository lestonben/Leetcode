public class q15_Longest_Repeating_Character_Placement {

    public  int characterReplacement(String s, int k) {
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
}
