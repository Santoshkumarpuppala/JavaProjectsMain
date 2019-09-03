package test;
public class BranchVerify extends Exception{
	public BranchVerify() {}
	public BranchVerify(String msg) {
		super(msg);
	}
	public void verify(String br)throws BranchVerify{
		try {
			switch(br) {
			case "CSE":
				break;
			case "ECE":
				break;
			case "EEE":
				break;
				default:
				throw new BranchVerify("Branch do not exist");
			}//end of awitch
		}catch(BranchVerify ob) {
			throw ob;
		}
		
	}

}
