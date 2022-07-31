package Linked_List;

/*
    https://leetcode.com/problems/reorder-list/
 */

public class q05_Reorder_List {

    /*
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode h1 = new ListNode(2);
        ListNode h2 = new ListNode(3);
        ListNode h3 = new ListNode(4);
        ListNode h4 = new ListNode(5);
        ListNode h5 = new ListNode(6);
        head.next = h1;
        h1.next = h2;
        h2.next = h3;
        h3.next = h4;
        h4.next = h5;

        reorderList(head);
    }
    */

    public void reorderList(ListNode head) {
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;

        ListNode l2 = reverse(slow);
        mergeLists(head, l2);
    }

    public ListNode reverse(ListNode head) {
        ListNode newList = null;

        while (head != null) {
            ListNode temp = newList;
            newList = head;
            head = head.next;
            newList.next = temp;
        }
        return newList;
    }

    public void mergeLists(ListNode l1, ListNode l2) {
        while (l2 != null) {
            ListNode temp = l1.next;
            l1.next = l2;
            l1 = l1.next;
            l2 = temp;
        }
    }

    /*
            Scenario: [1,2,3,4,5,6]
            Expected output: [1,6,2,5,3,4]

            1. identify the middle node of the list node
            2. flip the second half of the list node
            3. merge first half and second half node lists into one
     */
}
