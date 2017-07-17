package com.datastructure.list;

import java.util.ArrayList;
import java.util.List;

public class Queue {

	List<Object> list = null;
	int size;
	int enqueue;
	
	public Queue(int size) {
		new ArrayList<Object>(size);
		this.size = this.enqueue = 0;		
	}
	
	public void enqueue(int value) {
		if(this.enqueue < this.size) {
			list.add(value);
			this.size++;
			this.enqueue++;
		}		
	}
	
	public Object dequeue() {
		Object obj = null;
		if(this.size >= 0) {
			obj = list.get(this.size);
			this.size--;
			this.enqueue--;
		}
		return obj;
	}

}
