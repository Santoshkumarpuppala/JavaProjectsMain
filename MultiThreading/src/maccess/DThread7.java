package maccess;
import java.util.*;
import  test.Selection;
public class DThread7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner s = new Scanner(System.in);){
			System.out.println("Enter the no of tickets(User1):");
			int n1 = Integer.parseInt(s.nextLine());
			System.out.println("Enter the no of tickets(User2):");
			int n2 = Integer.parseInt(s.nextLine());
			Selection s1 = new Selection();
			Runnable r1=()->
			{
				s1.select(n1,Thread.currentThread().getName());
			};
			Runnable r2=()->
			{
				s1.select(n2,Thread.currentThread().getName());
			};
			Thread t1 = new Thread(r1);
			t1.setName("User1");
			Thread t2 = new Thread(r2);
			t2.setName("User2");
			t1.start();
			t2.start();
		} //end of try

	}

}
