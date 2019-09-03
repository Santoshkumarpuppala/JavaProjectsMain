package test;
public class Printer implements Runnable {
	@ Override
	public void run() {
		synchronized(this) {
			String name = Thread.currentThread().getName();
			for(int i = 1; i<=3; i++) {
				System.out.println(name);
				try {
					Thread.sleep(2000);;
				}catch(InterruptedException ie) {}
			}//end of loop
			}//end of synchronized lock
		
	}

}
