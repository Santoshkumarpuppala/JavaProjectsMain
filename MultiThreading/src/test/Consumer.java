package test;
public class Consumer implements Runnable {
	public Producer prod;
	public Consumer(Producer prod) {
		this.prod=prod;
	}
	@ Override
	public void run() {
		synchronized(prod.sb) {
			try {
				prod.sb.wait();
			}catch(Exception e) {}
			System.out.println("==Display using consumer");
			System.out.println(prod.sb);
		}//end of lock
	}
	

}
