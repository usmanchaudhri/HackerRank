package com.datastructure.list;


public class LinkedList {

	public Node head;
	public Node curr;
	int size;
	
	public boolean add(Node node) {
		if(head == null) {
			head = node;
			head.next = node;
			curr = head;
		} else {
			curr.next = node;
			curr = curr.next;
		}
		this.size++;
		return true;
	}

	public void reverse() {
		if(head == null) {
			return;
		}
		
		Node curr = head;
		Node previous = null;
		Node temp = null;
		while(curr.next != null) {
			temp = curr.next;
			curr.next = previous;
			previous = curr;
			curr = temp;			
		}		
	}

	// this method reverses the list 
	public Node reverse(Node node) {  
		if(node == null) {
			return null;
		}
		
		// reverse of node with one node will be the node it-self
		if(node.next == null) {
			return node;
		}
		
		Node secondElem = node.next;
		node.next = null;		
		Node reverse = reverse(secondElem);
		secondElem.next = node;				
		return reverse;
	}


	
}
