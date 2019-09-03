package test;
public class Task2 extends Thread {
	@ Override
	public void run() {
		for(int i = 1; i<=5; i++) {
			System.out.println("Task2");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException ie) {}
		}
	}

}
