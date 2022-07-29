package Binary_Search;

/*
    https://leetcode.com/problems/first-bad-version/
 */

public class q06_First_Bad_Version {

    private boolean isBadVersion(int value) { return true; }

    public int firstBadVersion(int n) {
        int low = 0, high = n;
        while (low <= high) {
            int mid = (low+high)/2;

            if (isBadVersion(mid)) { high = mid-1; }
            else { low = mid+1; }
        }
        return low;
    }

    /*
            Scenario: n = 5, bad = 4
            If isBadVersion(3) -> false
               isBadVersion(4) -> true   <=== is the first bad version
               isBadVersion(5) -> true

            By using the binary search method
            mid = (5+0)/2 -> 2 (false)
                = (5+3)/2 -> 4 (true)
                = (3+3)/2 -> 3 (false)
            return low = 4 as low < high condition is not fulfilled.
     */
}
