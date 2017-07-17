package scjp;

import java.io.Serializable;

public class ObjectSerialize implements Serializable {
	Wheels w;
	
	public static void main(String[] args) {
		ObjectSerialize ser = new ObjectSerialize();
	}
	
}

class Wheels { }
