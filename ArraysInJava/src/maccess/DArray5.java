package maccess;
import test.Display;
import test.StuData;
public class DArray5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display d1 = new Display();
		d1.dis(new Integer[] {12,13,14});
		d1.dis(new String [] {"java","nit", "prog"});
		d1.dis(new StuData[] {new StuData("A111","raj"), 
				new StuData("A112","ram")});

	}

}
