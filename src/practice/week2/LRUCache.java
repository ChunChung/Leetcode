package practice.week2;

import java.util.HashMap;


public class LRUCache{
	private class DNode{
		char val;
		DNode prev;
		DNode next;
		DNode(char val) {
			
			this.val = val;
			prev = null;
			next = null;
		}
	}
	
	HashMap<Character, DNode> cache = new HashMap<Character, DNode>(); 
	
	public LRUCache(int capacity) {
		
		
	}
	
	
	static public void main(String[] argv ) {
		
	}
}