package maccess;
import java.util.*;
import test.*;
public class DException6 {
	public static void main(String[] args) throws Employee.Designation {
		try(Scanner s = new Scanner(System.in);){
			try {
				System.out.println("Enter the eName");
				String eName = s.nextLine();
				System.out.println("Enter the EID");
				String eId = s.nextLine();
				Employee e = new Employee();
				e.verify(eName, eId);
				System.out.println("Enter the Desg");
				String eDesg = s.nextLine();
				e.des.verify(eDesg );
				System.out.println("ENter the Hno");
				String hNo = s.nextLine();
				System.out.println("ENter the sName");
				String sName = s.nextLine();
				System.out.println("Enter the city");
				String city = s.nextLine();
				System.out.println("Enter the pincode");
				int pinCode = Integer.parseInt(s.nextLine());
				e.add.verify(hNo, sName, city, pinCode);
				System.out.println("Enter the bsal");
				int bsal = Integer.parseInt(s.nextLine());
				e.verify(bsal);
				Display d1 = new Display();
				d1.dis(e);
			}catch (ESalary | EAddress | Employee.Designation | EmpIdCheck | NumberFormatException ob) {
				System.out.println("Details:" +ob.getMessage());
				System.out.println("ClassName:" +ob.getClass());
			}
		}//end of try
	}

}
