package scjp;

public class ThreadExcept implements Runnable {
	
	public void run() {throw new RuntimeException("exception "); }
	
	public static void main(String[] args) {
		new Thread(new ThreadExcept()).start();
		
		try {
			
			int x = Integer.parseInt(args[0]);
			Thread.sleep(x);
			System.out.println("main ");
		} catch (Exception e) {
			
		}
	}
	

}
