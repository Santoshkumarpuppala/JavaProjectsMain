package test;
import test.Balance;
public class WithDraw {
	Balance b1;
	public WithDraw(Balance b1){
		this.b1=b1;
	}
	void wDraw(int amt) {
		if(amt<b1.bal) {
			System.out.println("Amt WithDrawn" + b1.bal);
			b1.bal=b1.bal-amt;
			b1.getBal();
			System.out.println("Transaction completed");
		}
		else {
			System.out.println("Insufficient fund");
		}
		
	}
	
	
	

}
