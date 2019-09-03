package maccess;
import java.util.*;
@SuppressWarnings("serial")
public class DException4 extends Exception{
	public DException4(String msg) {
		super(msg);
	}
	public static void main(String[] args) {
		try(Scanner s = new Scanner(System.in);){
			try {
				System.out.println("Enter the amt:");
				int amt = Integer.parseInt(s.nextLine());
				if(amt<=0|| amt%100!=0) //exception
				{
					DException4 ob = new DException4("Insufficient fund");
					throw ob;
				}
				System.out.println("Amt WithDrawn:" +amt);
				System.out.println("Trnansation completed");
			}catch(DException4 | NumberFormatException ob) {
				System.out.println("Details"+ob.getMessage());
				System.out.println("Classname:" +ob.getClass());
			}
		}//end of try
				
				}
			}
		
