package Linked_List;

/*
    https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 */

public class q06_Remove_Nth_Node_From_End_of_List {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode h1 = new ListNode(2);
        ListNode h2 = new ListNode(3);
        ListNode h3 = new ListNode(4);
        ListNode h4 = new ListNode(5);

        head.next = h1;
        h1.next = h2;
        h2.next = h3;
        h3.next = h4;

        System.out.println("output: "+removeNthFromEnd(head, 2).val);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode newHead = new ListNode(0);
        ListNode slow = head, fast = head;
        newHead.next = head;

        //initially starts from index 0, so will fast is moving 3 time(s)
        while (n >= 0) {
            fast = fast.next;
            n--;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        //skip the element that is required to remove ( 3 -> 5, remove 4)
        slow.next = slow.next.next;
        return newHead.next;
    }

    /*
            Scenario: head = [1,2,3,4,5]   n = 2
            Expected output: [1,2,3,5] and removed 4

            1. loop the fast for n time(s)
                    0 -> 1 -> 2 -> 3 -> 4 -> 5
            slow =  ^
            fast =       ^ (1 time)
            fast =            ^ (2 time)

            2. loop until fast meeting the null
            while ( fast != null )
            slow =      ^
            fast =                 ^
            slow =           ^
            fast =                      ^
            slow =                 ^
            fast =                           ^
            slow =                       ^ (target found, 4)
            fast =                                ^

     */
}
