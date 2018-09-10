import utils.ListNode;

/*
[328] Odd Even Linked List  

https://leetcode.com/problems/odd-even-linked-list/description/

* algorithms
* Medium (44.71%)
* Total Accepted:    90.8K
* Total Submissions: 203.1K
* Testcase Example:  '[1,2,3,4,5,6,7,8]'

Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here we are talking about the node number and not the value in the nodes.

You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.


Example:
Given 1->2->3->4->5->NULL,
return 1->3->5->2->4->NULL.


Note:
The relative order inside both the even and odd groups should remain as it was in the input. 
The first node is considered odd, the second node even and so on ...


Credits:Special thanks to @DjangoUnchained for adding this problem and creating all test cases.
*/

public class LeetCode328 {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) 
            return head;
        ListNode dummy = new ListNode(0);
    
        dummy.next = head;
        
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = head.next;

        
        head = head.next.next;
        boolean oddNode = true;
        while (odd.next != null && even.next !=null) {
            odd.next = even.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        
        return dummy.next;
    }
	
}
