package LC110;

import java.util.LinkedList;
import java.util.Queue;

import utils.TreeLinkNode;

/*[116] Populating Next Right Pointers in Each Node  	

https://leetcode.com/problems/populating-next-right-pointers-in-each-node

* algorithms
* Medium (36.92%)
* Total Accepted:    
* Total Submissions: 


Given a binary tree

    struct TreeLinkNode {
      TreeLinkNode *left;
      TreeLinkNode *right;
      TreeLinkNode *next;
    }



Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.

Initially, all next pointers are set to NULL.


Note:

You may only use constant extra space.
You may assume that it is a perfect binary tree (ie, all leaves are at the same level, and every parent has two children).




For example,
Given the following perfect binary tree,

         1
       /  \
      2    3
     / \  / \
    4  5  6  7



After calling your function, the tree should look like:

         1 -> NULL
       /  \
      2 -> 3 -> NULL
     / \  / \
    4->5->6->7 -> NULL


*/

class LeetCode116{
    public void connect(TreeLinkNode root) {
/*
    	//Method1
    	if(root == null) return;
        Queue<TreeLinkNode> queue = new LinkedList<TreeLinkNode>();            
        queue.offer(root);        
        while(queue.size() != 0){
            int n = queue.size();
            while(n > 0) {
                TreeLinkNode node = queue.poll();
                if(n != 1) {
                    node.next = queue.peek();
                } else {
                    node.next = null;
                }
                
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
                n--;
            }
        }
 */       
        //Method 2
        if(root == null) return;
        while(root != null && root.left != null){
            TreeLinkNode p = root;
            while(p != null) {
                p.left.next = p.right;
                p.right.next = p.next == null ? null : p.next.left;
                p = p.next;
            }
            root = root.left;
        }
    }
}