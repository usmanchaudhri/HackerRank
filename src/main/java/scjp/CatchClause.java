package scjp;

public class CatchClause {
	public static void main(String[] args) {
		try {
			System.out.println("before ");
			throw new Exception();
		} catch (Exception ex) {
			System.out.println("catch ");
		} finally {
			System.out.println("finally ");
		}
		
		System.out.println("after catch ");
	}	
}

class Adder {
	static Short s1, s2;
	public static void main(String[] args) {
		int x;
		s1 = 4;
		x = s1 + s2;
		System.out.println(x);
	}
}