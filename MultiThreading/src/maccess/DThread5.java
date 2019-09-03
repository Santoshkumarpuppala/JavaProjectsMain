package maccess;
public class DThread5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable ob = ()->//Lambda
		{
			for(int i=1;i<=5;i++) {
				System.out.println("The val:"+i);
				try {
					Thread.sleep(2000);
				}catch(InterruptedException ie) {}
			}//end of loop
		};
		
		Thread t = new Thread(ob);//step4
		t.start(); //step5run()

	}

}
