package maccess;
import test.BranchCheck;
import java.util.*;
public class DException5 {
	public static void main(String[] args)
	{
		try(Scanner s = new Scanner(System.in);){
			try {
				System.out.println("Enter the branch");
				String br = s.nextLine();
				BranchCheck bc = new BranchCheck();
				bc.verify(br.toUpperCase()); //method call
				System.out.println("Enter the RNO:");
				String rNo = s.nextLine();
				System.out.println("Branch" +br);
				System.out.println("RollNo"+rNo);
			}catch(BranchCheck bc) {
				System.out.println("Details:"+bc.getMessage());
				System.out.println("ClassName" +bc.getClass());
			}
		}//End try
	}

}
