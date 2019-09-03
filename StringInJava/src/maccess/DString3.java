package maccess;
import java.util.*;
public class DString3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner s = new Scanner(System.in);){
			System.out.println("Enter the string1");
			String s1 = s.nextLine().trim();
			System.out.println("Enter the String2:");
			String s2 = s.nextLine().trim();
			System.out.println("-----equals()-------");
			boolean k = s1.equalsIgnoreCase(s2);
			if(k) {
				System.out.println("Strings are equal...");
			}else {
				System.out.println("Strings are not equal...");
			}
			System.out.println(".......CompareTo()......");
			int z = s1.compareToIgnoreCase(s2);
			if(z==0) {
				System.out.println("Strings are equal..");
			}else {
				System.out.println("Strings are not Equal....");
			}
		}//End of try

	}

}
