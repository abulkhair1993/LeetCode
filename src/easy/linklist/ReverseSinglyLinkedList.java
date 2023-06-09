package easy.linklist;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/560/
 */
public class ReverseSinglyLinkedList {


    public static ListNode reverseList(ListNode head) {

        ListNode prev = null;

        while(head != null) {
            ListNode next_node = head.next;
            head.next = prev;
            prev = head;
            head = next_node;
        }
        return prev;
    }




    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
