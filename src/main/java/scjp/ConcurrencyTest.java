package scjp;

public class ConcurrencyTest implements Runnable {

	private static int i;
	
	public synchronized void run() {		
		if(i%10 != 0) {i++;}
		for(int x=0; x<10; x++, i++) {
			if(x == 4) Thread.yield();
		}
	}
	
	public static void main(String[] args) {
		ConcurrencyTest n = new ConcurrencyTest();
		for(int x=0; x<101; x++) {
			new Thread(n).start();
			System.out.println(i + " ");
		}
	}

}
