package maccess;
import java.util.*;
import test.Transaction2;
@SuppressWarnings("serial")
public class DException9 extends Exception {
	public DException9(String msg) {
		super(msg);
	}
	public static void main(String[] args) {
		try(Scanner s= new Scanner(System.in);){
			try {
				System.out.println("Enter the amt:");
				int a1 = Integer.parseInt(s.nextLine());
				if(a1<=0 || a1%100!=0)//exception
				{
					throw new DException9("invalid amt..");
				}
				Transaction2 wd = new Transaction2()//anonymous
				{
					@ Override
					public void process(double amt) throws Exception{
						try {
							if(amt>b1.bal) //Exception
							{
								throw new Exception("insufficient fund ..");
							}
							System.out.println("Amt withDrawn:" +amt);
							b1.bal = b1.bal-amt;
							b1.getBal();
							System.out.println("Transaction Completed");
			}catch(Exception wd) {
				throw wd; //re throwing
		}
	}
};
