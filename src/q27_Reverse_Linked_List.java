public class q27_Reverse_Linked_List {

    public ListNode reverseList(ListNode head) {
        ListNode newNodeList = null;

        while (head != null) {
            ListNode temp = newNodeList;
            newNodeList = head;
            head = head.next;
            newNodeList.next = temp;
        }
    }
}
