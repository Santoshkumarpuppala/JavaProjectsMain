package test;
public class Display extends Thread { //step1
	@ Override
	public void run() { //step2
		for(int i = 1;i<=10;i++) {
			System.out.println("The val:" +i);
			try {
				Thread.sleep(2000);
			}catch(InterruptedException ie) {}
		}//end of loop
		
	}

}
