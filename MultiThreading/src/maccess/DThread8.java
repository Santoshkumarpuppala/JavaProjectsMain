package maccess;
import test.Producer;
import test.Consumer;
public class DThread8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producer p1 = new Producer();
		Consumer c1 = new Consumer(p1);
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(c1);
		t2.start();
		t1.start();

	}

}
