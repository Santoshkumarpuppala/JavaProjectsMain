package test;
public class Task1 extends Thread {
	@ Override
	public void run() {
		for(int i = 1; i<=5; i++) {
			System.out.println("Task1");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException ie) {}
		}
	}

}
