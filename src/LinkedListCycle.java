public class LinkedListCycle {    
	
	public static boolean hasCycle(ListNode head) {
		
		return true;
	}
    
    static public void main(String argv[]) {
    	ListNode head = new ListNode(1);
    	ListNode node_1 = new ListNode(3);
    	ListNode node_2 = new ListNode(4);
    	boolean res = false;
    	
    	head.next = node_1;
    	node_1.next = node_2;
    	node_2.next = head;
    	
    	res = hasCycle(head);
    	
    }
}