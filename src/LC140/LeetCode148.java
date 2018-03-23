package LC140;

import utils.ListNode;
import utils.LinkedListUtil;


class LeetCode148 {
	private ListNode merge(ListNode lHead, ListNode rHead) {
		ListNode dummy = new ListNode(0);
		ListNode pointer = dummy;
		while (lHead != null && rHead != null) {
			if (lHead.val < rHead.val) {
				pointer.next = lHead;
				lHead = lHead.next;
			} else {
				pointer.next = rHead;
				rHead = rHead.next;
			}
			pointer = pointer.next;
		}
		
		if (null != lHead) {
			pointer.next = lHead;
		} else if (null != rHead) {
			pointer.next = rHead;
		}
		
		return dummy.next;
	}

    public ListNode sortList(ListNode head) {
    	if(null == head || null == head.next) 
    		return head;
    	
    	//LinkedListUtil util = new LinkedListUtil();
    	
    	ListNode mid = LinkedListUtil.findMiddle(head);
    	ListNode right = sortList(mid.next);
    	mid.next = null;	
    	ListNode left = sortList(head); 	
    	
    	return merge(left, right);
    }
    
    public static void main(String[] argv) {
    	LeetCode148 test = new LeetCode148();
    	
    	ListNode node1 = new ListNode(1);
    	ListNode node2 = new ListNode(3);
    	ListNode node3 = new ListNode(2);
    	
    	node2.next = node3;
    	node3.next = node1;
    	
    	ListNode ans = test.sortList(node2);
    	System.out.println(LinkedListUtil.ListToString(ans));
    }
}