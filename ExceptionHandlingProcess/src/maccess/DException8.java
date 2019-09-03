package maccess;
import java.util.*;
import test.WithDraw;
@SuppressWarnings("serial")
public class DException8 extends Exception {
	public DException8(String msg) {
		super(msg);
	}
	public static void main(String[] args) {
		try(Scanner s= new Scanner(System.in);){
			try {
				System.out.println("Enter the amt:");
				int a1 = Integer.parseInt(s.nextLine());
				if(a1<=0 || a1%100!=0)//exceptino
				{
					throw new DException8("invalid amt..");
				}
				WithDraw wd = new WithDraw();
				wd.process(a1); //emthod call
			}catch(WithDraw | DException8 | NumberFormatException ob) {
				System.out.println("Details" +ob.getMessage());
				System.out.println("Classname" +ob.getClass());
			}
		}//end of try
	}
	

}
