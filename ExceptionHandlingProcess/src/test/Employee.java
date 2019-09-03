package test;
@SuppressWarnings("serial")
public class Employee extends ESalary{
	public String eName,eId;
	public Employee() {}
	public Employee(String msg) {
		super(msg);
	}
	public void verify(String eName, String eId)
	throws Employee, EmpIdCheck{
		try {
			if(eName.length()==0)
			{
				throw new Employee("Invalid name");
			}
			EmpIdCheck eid = new EmpIdCheck();
			eid.verify(eId);//method call
			this.eName=eName;
			this.eId=eId;
		}catch(Employee | EmpIdCheck ob) {
			throw ob; //rethrowing
		}
	}//end of verify
	public class Designation extends Exception{
		public String eDesg;
		public Designation(){}
		public Designation(String msg) {
			super(msg);
		}
		public void verify(String eDesg) throws Designation{
			try {
				switch(eDesg) {
				case "SE":this.eDesg=eDesg;
				break;
				case"TE":this.eDesg=eDesg;
				break;
				default:
					throw  new Designation("Desg do not exist");
				}//end of switch
			}catch(Designation de) {
				throw de; //rethrowing
			}
		}//end of verify
	}//inner class
	public Designation des = new Designation(); //Innerclass obj
	public EAddress add = new EAddress(); //referred class obj
	public void getEmpData() {
		System.out.println("Ename:" +eName);
		System.out.println("EID:" +eId);
		System.out.println("Edesg;" +des.eDesg);
	}
	
		
	}