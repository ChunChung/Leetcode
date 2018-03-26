package utils;

public class LinkedListUtil {
	public static ListNode findMiddle(ListNode head) {
		if (null == head || null == head.next) 
			return head;
		
		ListNode slow = head;
		ListNode fast = head.next;
		
		while (null != fast && null != fast.next) {
			fast = fast.next.next;
			slow = slow.next;
		}
		
		return slow;
	}
	
	public static String ListToString(ListNode head) {
		StringBuilder sb = new StringBuilder();
		
		while (head != null) {
			if (sb.length() == 0) {
				sb.append(head.val);
			} else {
				sb.append(", " + head.val);
			}
			head = head.next;
		}
		
		return sb.toString();
	}
}