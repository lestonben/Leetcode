package Linked_List;

public class q01_Reverse_Linked_List {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode reverseList(ListNode head) {
        ListNode newNodeList = null;

        while (head != null) {
            ListNode temp = newNodeList;
            newNodeList = head;
            head = head.next;
            newNodeList.next = temp;
        }
        return newNodeList;
    }

    /*
        initialize a newNodeList = null
        then in while loop, assign newNodeList to a temp variable (temp = null)
        meanwhile can use newNodeList = head (get the current head value)
        then continue with the head list's next value, head = head.next
        then combine the newNodeList with the temp, becomes, newNodeList = 1 -> null
     */
}
