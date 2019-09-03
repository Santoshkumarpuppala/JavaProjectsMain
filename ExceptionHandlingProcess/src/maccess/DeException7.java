package maccess;
import test.CClass;
import java.util.*;
public class DeException7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner s = new Scanner(System.in);){
			try {
				System.out.println("Enter the value x:");
				int x = Integer.parseInt(s.nextLine());
				CClass ob = new CClass();
				ob.calculate(x);//methos call
			}catch(CClass | NumberFormatException ob) {
				System.out.println("Details:" +ob.getMessage());
				System.out.println("ClassName:"+ob.getClass());
			}
		}//end of try

	}

}
