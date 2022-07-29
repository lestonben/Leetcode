package Linked_List;

/*
    https://leetcode.com/problems/middle-of-the-linked-list/
 */

public class q03_Middle_of_the_Linked_List {

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    /*
        Approach: Fast and slow pointers (once fast pointer reaches the null, then stop looping)
        - slow: head.next;
        - fast: head.next.next;
           Scenario:   1 -> 2 -> 3 -> 4 -> 5 -> null
           1.   Slow = ^
                Fast =      ^
           2.   Slow =      ^
                Fast =                ^
           3.   Slow =           ^ (target)
                Fast =                            ^ (done)

         ans: [3,4,5]
     */
}
