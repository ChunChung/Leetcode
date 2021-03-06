/*
[2] Add Two Numbers  

https://leetcode.com/problems/add-two-numbers/description/

* algorithms
* Medium (28.58%)
* Total Accepted:    470.3K
* Total Submissions: 1.6M
* Testcase Example:  '[2,4,3]\n[5,6,4]'

You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.


Example

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.


*/

package LC0;

import utils.ListNode;

public class LeetCode002 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode headList = new ListNode(0);
        ListNode p3 = headList; 
        
        while (l1 != null || l2 != null) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;   
                l1 = l1.next;
            }
            
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            
            p3.next = new ListNode(sum % 10);
            p3 = p3.next;
            carry = sum/10;
        }
        
        if (carry > 0) {
            p3.next = new ListNode(carry);
            p3 = p3.next;
        }
        
        return headList.next;
    }
}