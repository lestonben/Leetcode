package Array;

/*
    https://leetcode.com/problems/isomorphic-strings/
 */

public class q14_Isomorphic_Strings {

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "pdd"));
        System.out.println(isIsomorphic("bbbaaaba","aaabbbba"));
    }

    public static boolean isIsomorphic(String s, String t) {
        int[] arr1 = new int[256];
        int[] arr2 = new int[256];

        for (int i=0; i<s.length(); i++) {
            if (arr1[s.charAt(i)] != arr2[t.charAt(i)]) return false;

            arr1[s.charAt(i)] = i+1;
            arr2[t.charAt(i)] = i+1;
        }
        return true;
    }

    /*

        s =    b b b a a a b a
        t =    a a a b b b b a
               0 1 2 3 4 5 6 7
                           ^ (error)
        s =    array['b'] = 3 (2+1) last added of 'b' is index 2
        t =    array['b'] = 6 (5+1) last added of 'b' is index 5

     */
}
