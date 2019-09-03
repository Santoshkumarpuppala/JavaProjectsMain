package p4;
import p3.Transaction;
public class Deposit implements Transaction{
	@Override
	public void process(double amt) {
		// TODO Auto-generated method stub
		System.out.println("Amt Deposited:" +amt);
		b1.bal = b1.bal+amt;
		b1.getBal();
		System.out.println("Transaction completed");
	}

}
