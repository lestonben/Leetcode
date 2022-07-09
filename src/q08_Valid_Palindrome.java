public class q08_Valid_Palindrome {

    public static void main(String[] args) {
        isPalindrome("abc i cba");
    }

    public static boolean isPalindrome(String s) {
        //使用双指针方式左右对比
        int left = 0;
        int right = s.length()-1;
        while (left <= right) {
            System.out.println(left + " ; "+ right);
            if (!Character.isLetterOrDigit(s.charAt(left))) { left++; }
            else if (!Character.isLetterOrDigit(s.charAt(right))) { right--; }
            else {
                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                    return false;
                }
                left++;
                right--;
            }
            System.out.println("after: "+left + " ; "+ right);
        }
        return true;
    }
}
