package maccess;
import test.StuData;
public class DArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ob1 = new String("nit");
		Integer ob2 = new Integer(123);
		StuData ob3 = new StuData("A111","Raj");
		Object o[]= {ob1,ob2,ob3};
		System.out.println("-----Dis Object Array-----");
		for(Object k : o) {
			System.out.println(k);
		}//end of loop

	}

}
