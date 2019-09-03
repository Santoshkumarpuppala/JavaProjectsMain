package maccess;
public class DException12 {
	public static void main(String[] args) {
		for(int i =1; i<=10; i++) {
			System.out.println("val:" +i);
			try {
				Thread.sleep(20000);
			}catch(InterruptedException ie) {}
		}//End of loop
	}

}
