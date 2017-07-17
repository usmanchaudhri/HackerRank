package scjp;

public abstract class Color {
	protected abstract String getRGB();
}

class Blue extends Color {
	protected String getRGB() {return "RBG";}
}

class Test {
	int[] x = {1,2,3};
	int [] y1 = x;	
	
	public void foo(int... intArgs) {
		
	}
}
