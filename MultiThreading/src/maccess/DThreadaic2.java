package maccess;
public class DThreadaic2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread ob1 = new Thread() { //Anonymous
			@ Override
			public void run() {
				for(int i=1;i<=5;i++) {
					System.out.println("Task1");
					try {
						Thread.sleep(2000);
					}catch(InterruptedException ie) {}
				}//end of loop
			}
		};
				Thread ob2 = new Thread() {//anonymous
					@ Override
					public void run() {
						for(int i=21;i<=25;i++) {
							System.out.println("Task2");
							try {
								Thread.sleep(2000);
							}catch(InterruptedException ie) {}
						}//end of loop
					}
	};
	ob1.start();
	ob2.start();
}
}
							
		