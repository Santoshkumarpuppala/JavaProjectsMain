package test;
public class Producer implements Runnable{
	public StringBuilder sb;
	public Producer() {
		sb=new StringBuilder();
	}
	@ Override
	public void run() {
		synchronized(sb) {
			for(int i=1;i<=10;i++) {
				sb.append(i+":");
				System.out.println("Producer appending...");
				try {
					Thread.sleep(2000);
				}catch(InterruptedException ie) {}
			}//end of loop
			sb.notify();
		}//end of lock
	}

}
