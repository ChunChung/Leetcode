/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return head;
        }    

        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode fast = dummyNode;
        ListNode slow = dummyNode;

        int len = n % length(head);

        while (len > 0) {
            fast = fast.next;
            len --;
        }
        while (fast.next != null && slow != fast) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return dummyNode.next;
    }
    private int length(ListNode root) {
        int len = 0;
        while (root != null) {
            root = root.next;
            len ++;
        }
        return len;
    }
}
