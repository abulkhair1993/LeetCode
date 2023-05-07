package easy.linklist;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/553/
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class DeleteNode {
    public static void main(String[] args) {
        ListNode obj = new ListNode(1);
        ListNode obj2 = new ListNode(2);
        ListNode obj3 = new ListNode(3);
        ListNode obj4 = new ListNode(4);
        ListNode obj5 = new ListNode(5);
        obj.next = obj2;
        obj2.next = obj3;
        obj3.next = obj4;
        obj4.next = obj5;

        print(obj);
        deleteNode(obj2);
        print(obj);


    }

    private static void print(ListNode obj) {
        while (true) {
            if (obj.next == null) {
                System.out.println(obj.val);
                break;
            } else {
                System.out.println(obj.val);
                obj = obj.next;
            }
        }
    }

    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }


}
