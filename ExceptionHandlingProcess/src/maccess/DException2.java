package maccess;
import java.util.*;
public class DException2 {
	public static void main(String[] args) {
		Scanner s=null;
		try {
			s = new Scanner(System.in);
			System.out.println("Enter the val:");
			int v = Integer.parseInt(s.nextLine());
			//Exception for non int value
			int z = 44/v; //Execption when v = 0
			System.out.println("Enter the val z:"+z);
		}//end of try
		catch(ArithmeticException ob)
		{
			System.out.println("Enter the NonZero val:");
			System.out.println("Details" +ob.getMessage());
			System.out.println("className"+ob.getClass());
		}
		catch(NumberFormatException nf)
		{
			System.out.println("Enter the Integer val:");
			System.out.println("Details" +nf.getMessage());
			System.out.println("className"+nf.getClass());
			
		}
		finally
		{
			if(s!=null)
			{
				s.close();
			}
		}
		
}

}
