package maccess;
import  test.BranchCheck;
import test.BranchVerify;
import java.util.*;
public class DString6 extends Exception {
	public DString6(String msg) {
		super(msg);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner s= new Scanner(System.in);){
			try {
			System.out.println("Enter the Branch:");
			String br = s.nextLine().trim();
			BranchVerify bv = new BranchVerify();
			bv.verify(br.toUpperCase());
			System.out.println("Enter the rollNo:");
			String rollNo = s.nextLine();
			if(rollNo.length()!=10) {
				throw new DString6("Invalid rollNo");
			}
			BranchCheck bc = new BranchCheck();
			bc.verify(rollNo.substring(6,8), br.toUpperCase());
			System.out.println("Branch:" +br);
			System.out.println("RollNo:"+rollNo);
			}catch(DString6 | BranchVerify | BranchCheck ob) {
				System.out.println("Details:" +ob.getMessage());
				System.out.println("Classname:" +ob.getClass());
				
			}
		}//End of try

	}

}
