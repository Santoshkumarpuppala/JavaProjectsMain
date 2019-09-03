package maccess;
import java.util.*;
public class DException3{
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in);) //Java 7
		{
			System.out.println("Enter the val:");
			int v = Integer.parseInt(s.nextLine());
			//Exception for non int value
			int z = 44/v; //Execption when v = 0
			System.out.println("Enter the val z:"+z);
		}//end of try
		catch(ArithmeticException|NumberFormatException ob) //java7
		{
			System.out.println("Enter the NonZero val:");
			System.out.println("Details" +ob.getMessage());
			System.out.println("className"+ob.getClass());
		}
		
	}

}
