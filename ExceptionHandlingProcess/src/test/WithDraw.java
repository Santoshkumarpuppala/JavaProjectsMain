package test;

public class WithDraw extends Exception implements Transaction1{
	public WithDraw() {}
	public WithDraw(String msg) {
		super(msg);
	}
	@ Override
	public void process(double amt) throws WithDraw{
		try {
			if(amt <b1.bal) //Exception
			{
			throw new WithDraw("Insuffincent fund....");
			}
			System.out.println("Amt withDrawn:" +amt);
			b1.bal = b1.bal-amt;
			b1.getBal();
			System.out.println("Transaction Completed");
		}catch(WithDraw wd) {
			throw wd; //rethrowing
		}
	}
}
