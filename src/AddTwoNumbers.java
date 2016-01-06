public class AddTwoNumbers {

	static public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	static public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int unit = 0;
		int tenith = 0;
		ListNode result = null;
		ListNode result_ptr = null;
		while (l1 != null || l2 != null) {
			unit = tenith;
			if (l1 != null) {
				unit = unit + l1.val;
			}
			if (l2 != null)
				unit = unit + l2.val;
			tenith = unit / 10;
			unit = unit % 10;
			ListNode node = new ListNode(unit);
			if (result == null) {
				result = node;
				result_ptr = result;
			} else {
				result_ptr.next = node;
				result_ptr = result_ptr.next;
			}
			if(l1 != null)
				l1 = l1.next;
			if(l2 != null)
				l2 = l2.next;
		}
		if(l1==null && l2 == null && tenith!=0) {
			ListNode node = new ListNode(tenith);
			result_ptr.next = node;
			result_ptr = result_ptr.next;
		}
		return result;
	}

	static public void main(String argv[]) {
		ListNode l1 = new ListNode(5);
		ListNode l2 = new ListNode(5);

		ListNode result = addTwoNumbers(l1, l2);
		while (result != null) {
			System.out.println(result.val);
			result = result.next;
		}
	}
}
