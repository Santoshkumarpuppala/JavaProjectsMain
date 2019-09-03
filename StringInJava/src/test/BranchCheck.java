package test;
@SuppressWarnings("serial")
public class BranchCheck extends Exception {
	public BranchCheck() {}
	public BranchCheck(String msg) {
		super (msg);
	}
	public String b;
	public void verify(String code, String br)throws BranchCheck{
		try {
			switch(code) {
			case "05":b = "CSE";
			break;
			case "04":b = "ECE";
			break;
			case "02":b = "EEE";
			break;
			default:
				throw new BranchCheck("Invalid RollNO");
			}//end of switch
			if(!(b.equals(br))) {
				throw new BranchCheck("Invalid RollNo");
			}
		}catch(BranchCheck ob) {
			throw ob;
		}
	}
}
