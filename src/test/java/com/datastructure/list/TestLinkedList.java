package com.datastructure.list;

import org.junit.Test;

/**
 * Test adding items to linked list.
 * */
public class TestLinkedList {

	@Test
	public void test_add_items_to_list() {
		LinkedList list = new LinkedList();		
		for(char i='a'; i<'z'; i++) {			
			list.add(new Node(String.valueOf(i)));
		}		
		print(list);		
	}
	
	@Test
	public void test_reverse_linked_list() {
		LinkedList list = new LinkedList();		
		for(char i='a'; i<'d'; i++) {			
			list.add(new Node(String.valueOf(i)));
		}		
		Node reverse = list.reverse(list.head);
		print(reverse);
	}	
	
	private void print(Node node) {
		while(node.next != null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}
	
	private void print(LinkedList l) {
		Node node = l.head;
		while(node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}
		
}
