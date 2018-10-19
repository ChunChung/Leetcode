/*
 * [147] Insertion Sort List
 *
 * https://leetcode.com/problems/insertion-sort-list
 *
 * algorithms
 * Medium (32.93%)
 * Total Accepted:    102.7K
 * Total Submissions: 312K
 * Testcase Example:  '[]'
 *
 * Sort a linked list using insertion sort.
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class LeetCode147 {
    public ListNode insertionSortList(ListNode head) {
		ListNode dummy = new ListNode(-1);
		while (head != null) {
			ListNode next = head.next;
			insertionSortHelper(dummy, head);
			head = next;
		}

		return dummy.next;
    }

	private void insertionSortHelper(ListNode dummy, ListNode node) {
		ListNode cur = dummy.next;
		ListNode pre = dummy;

		if (cur == null) {
			dummy.next = node;
			node.next = null;
			return;
		}

		while (cur != null) {
			if (node.val < cur.val) {
				pre.next = node;
				node.next = cur;
				return;
			}
			else {
				pre = cur;
				cur = cur.next;
			}
		}
		pre.next = node;
		node.next = null;
	}
}
