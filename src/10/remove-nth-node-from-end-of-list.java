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

        int len = length(head) - n;
        if (len < 0) {
            return head;
        }
        else {
            while (len > 0) {
                fast = fast.next;
                len --;
            }
            while (n >= 0) {
                fast = fast.next;
                slow = slow.next;
                n--;
            }
        }

        slow.next = slow.next.next;

        return head;
    }
    private int length(ListNode root) {
        if (root == null) {
            return 0;
        }
        int len = 0;
        while (root != null) {
            root = root.next;
            len ++;
        }
        return len;
    }
}
