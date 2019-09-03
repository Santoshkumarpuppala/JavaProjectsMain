package maccess;
import java.util.*;
public class DString9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner s= new Scanner(System.in);){
			StringJoiner sj = new StringJoiner("/");
			System.out.println("Enter the Date");
			String date = s.nextLine();
			sj.add(date);
			System.out.println("ENter the month:");
			String month = s.nextLine();
			sj.add(month);
			System.out.println("ENter the year:");
			String year = s.nextLine();
			sj.add(year);
			System.out.println("DOB:"+sj.toString());
		}//End of try

	}

}
