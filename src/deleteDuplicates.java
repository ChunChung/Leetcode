public class deleteDuplicates {    
	
	public static boolean hasCycle(ListNode head) {
		
		if(head !=null && head.next == null) {
			return false;
		}
		
		ListNode faster = head;
		ListNode slower = head;
		
		while(faster != null && slower != null && faster.next.next != null) {
		
			faster = faster.next.next;
			slower = slower.next;
			
			if(faster == slower)
				return true;
		}
		
		return false;
	}
    
    static public void main(String argv[]) {
    	ListNode head = null;
    	boolean res = false;
    	
//    	ListNode node1 = new ListNode(2);
//    	ListNode node2 = new ListNode(3);
//    	ListNode node3 = new ListNode(4);
//    	head.next = node1;
//    	node1.next = node2;
//    	node2.next = head;
    	
    	res = hasCycle(head);
    	if(res) {
    		System.out.println("Cycle!");
    	}
    	else {
    		System.out.println("No Cycle!");
    	}
    	
    }
}