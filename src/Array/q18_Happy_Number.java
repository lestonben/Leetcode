package Array;

/*
    https://leetcode.com/problems/happy-number/
 */

import java.util.HashSet;
import java.util.Set;

public class q18_Happy_Number {

    public boolean isHappy(int n) {
        Set<Integer> occurrence = new HashSet<>();
        while (occurrence.add(n)) {
            int sum = 0;
            while (n != 0) {
                int temp = n % 10;
                sum += temp * temp;
                n = n / 10;
            }
            if (sum == 1) { return true; }
            else { n = sum; }
        }
        return false;
    }
}
