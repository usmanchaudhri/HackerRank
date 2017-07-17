package scjp;

import java.util.TreeSet;

class Stuff implements Comparable {
	int x;
	public Stuff(int x) { this.x = x; }
	public int compareTo(Object o) { 
		return 0; 
	}		
}

public class AddStuff {
	
	public static void main(String[] args) {
		TreeSet<Stuff> ts = new TreeSet<Stuff>();
		ts.add(new Stuff(1));
		ts.add(new Stuff(2));
		System.out.println(ts.size());
	}
	
}