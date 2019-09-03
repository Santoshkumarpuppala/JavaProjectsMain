package test;
@SuppressWarnings("serial")
public class EmpIdCheck extends Exception {
	public EmpIdCheck() {}
	public EmpIdCheck(String msg) {
		super(msg);
	}
	public void verify(String eId) throws EmpIdCheck
	{
		try {
			switch(eId) {
			case "A111":
				break;
			case "A222":
				break;
				default:
					throw new EmpIdCheck("EID do not exist");
			}
		}catch(EmpIdCheck eid) {
			throw eid;
			
		}
	}
	

}
