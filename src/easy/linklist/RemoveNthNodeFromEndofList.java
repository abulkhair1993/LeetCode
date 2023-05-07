package easy.linklist;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/603/
 */


public class RemoveNthNodeFromEndofList {

    class ListNode {
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

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy_head = new ListNode(0);
        dummy_head.next = head;

        ListNode fast = head;
        ListNode slow = head;

        for(int i=1;i<=n+1; i++) {
            fast = fast.next;
        }

        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return dummy_head.next;

    }

    public ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode temp = head;
        int cnt = 0;

        while (temp != null) {
            cnt += 1;
            temp = temp.next;
        }

        int step = cnt - n;

        if (step == 0) {
            return head.next;
        }

        temp = head;
        for (int i = 1; i < step; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;

        return head;
    }


}
