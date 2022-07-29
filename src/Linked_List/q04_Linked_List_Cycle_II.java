package Linked_List;

/*
    https://leetcode.com/problems/linked-list-cycle-ii/
 */

public class q04_Linked_List_Cycle_II {

    public ListNode deleteCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) { break; }
        }

        if (fast == null || fast.next == null) { return null; }

        while (slow != head) {
            slow = slow.next;
            head = head.next;
        }
        return slow;
    }

    /*
            First step: fast is always 1 step ahead of slow until meeting each other.
                    If: both pointers are reaching the null, then return false.
                  Else: loop slow and head pointers until meeting each other, then return position.
     */
}
