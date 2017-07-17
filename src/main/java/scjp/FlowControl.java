package scjp;

public class FlowControl {

	public static void main(String[] args) {
		boolean x = true;
		boolean y = false;
		short z = 42;
		
		if((x == true) && (y == true)) z++;
		if((y == true) || (++z == 44)) z++;
		
		System.out.println("z = " + z);
		
		int p=8;
		while(++p < 9) {
			System.out.println("post increment" + p);
		}
	}

}
