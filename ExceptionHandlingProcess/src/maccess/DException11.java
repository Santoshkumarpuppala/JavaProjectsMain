package maccess;
import java.util.*;
import test.ITest;
public class DException11 {
	public static void main(String[] args) {
		try(Scanner s = new Scanner(System.in);){
			try {
				System.out.println("Enter the val x:");
				int x = Integer.parseInt(s.nextLine());
				ITest ob = new ITest(){};
				ob.m1(x); //default
				System.out.println("Enter the val y:");
				int y = Integer.parseInt(s.nextLine());
				ITest.m2(y); //static method call		
			}catch(Exception e) {
				System.out.println("Details" +e.getMessage());
				System.out.println("ClassName" +e.getClass());
			}
			
		}
	}

}
