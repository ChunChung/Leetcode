public class Leetcode328 {    
	
	public static ListNode oddEvenList(ListNode head) {
		
        ListNode odd = null;
        ListNode even = null;
        ListNode evenhead = null;
        
        odd = head;
        
        if(head == null || head.next == null) return head;
        
        
        while (true) {
            if (odd.next != null) {
                if (even == null) {
                    even = odd.next;
                    evenhead = even;
                }
                else {
                    even.next = odd.next;
                    even = even.next;
                }
                
                if(odd.next.next == null) {
                    even.next = null;
                    break;
                }
                
                System.out.print(odd.val);
                odd.next = odd.next.next;
                odd = odd.next;

            }
            else {
            	if (even != null) {
            		even.next = null;
            	}
                break;
            }
        }
        odd.next = evenhead;          
        return head;
	}
    
    static public void main(String argv[]) {
    	ListNode head = null;
    	ListNode res = null;
    	
    	ListNode node1 = new ListNode(2);
    	ListNode node2 = new ListNode(3);
    	ListNode node3 = new ListNode(4);
    	head = node1;
    	node1.next = node2;
    	node2.next = node3;
    	
    	res = oddEvenList(head);
    	while (res != null) {
    		res = res.next;
    	}
    }
}