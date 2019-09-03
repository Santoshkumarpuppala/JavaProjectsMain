package maccess;
import java.util.*;
import test.Transaction2;
@SuppressWarnings("serial")
public class DException10 extends Exception {
	public DException10(String msg) {
		super(msg);
	}
	public static void main(String[] args) {
		try(Scanner s = new Scanner(System.in);){
			try {
				System.out.println("Enter the amt");
				int a1 = Integer.parseInt(s.nextLine());
				if(a1<=0 || a1%100!=0) //exception
				{
					throw new DException10("Invali amt...");
				}
				Transaction2 wd = (double amt)-> //lambda
				{
					try {
						if(amt>Transaction2.b1.bal) //excetption
						{
							throw new Exception("Inusfficinet fund..");
						}
						System.out.println("Amt Withdrawn:" +amt);
						Transaction2.b1.bal = Transaction2.b1.bal-amt;
						Transaction2.b1.getBal();
						System.out.println("Transaction completed");
						}catch(Exception ob) {
							System.out.println("Details:" +ob.getMessage());
							System.out.println("ClassName:" +ob.getClass());
							}
	}
	}
}

	
