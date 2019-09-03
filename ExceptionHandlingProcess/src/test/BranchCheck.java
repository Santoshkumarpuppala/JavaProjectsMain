package test;
@SuppressWarnings("serial")
public class BranchCheck extends Exception{
	public BranchCheck() {}
	public BranchCheck (String msg) {
		super(msg);
	}
	public void verify(String br)
	throws BranchCheck
	{
		try {
			switch(br)
			{
			case "ECE":
				break;
			case "EEE":
				break;
			case "CSE":
				break;
				default: //Exception
					BranchCheck bc = new BranchCheck("Br do no rxist");
					throw bc;
			}
			}catch(BranchCheck bc) {
				throw bc; //Rethrowing
			
			}
		}
	}
