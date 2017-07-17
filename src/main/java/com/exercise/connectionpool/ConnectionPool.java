package com.exercise.connectionpool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ConnectionPool {

	private int maxCon;
	private int minCon;
	private int currPoolSize;
	private BlockingQueue<Object> pool;
	
	public ConnectionPool(int minCon, int maxCon) {
		this.minCon = minCon;
		this.maxCon = maxCon;
		pool = new LinkedBlockingQueue<Object>(maxCon);		
	}
	
	public void openAndPoolConnection() {
		if(this.currPoolSize == this.maxCon) {
			return;
		}
		
		String connection = new String("connection");
		pool.offer(connection);
		this.currPoolSize++;		
	}
	
	public Object borrowConnection() throws InterruptedException {
		if(pool.peek() == null && currPoolSize < this.maxCon) {
			openAndPoolConnection();
		}
		return pool.take();
	}
	
	public void surrenderConnection(String con) {
		pool.offer(con);
	}
	
	
}
