package test;
public class DTest implements Runnable { //step1
	@ Override
	public void run() {//step2
		for(int i=1;i<=5;i++) {
			System.out.println("The val:"+i);
			try {
				Thread.sleep(2000);
			}catch(InterruptedException ie) {}
		}//end of loop
	}
	
}
