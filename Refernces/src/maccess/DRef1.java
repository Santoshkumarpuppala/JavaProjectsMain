package maccess;
import test.Balance;
import test.WithDraw;
import java.util.*;
public class DRef1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the amt to be withdrawn");
		int amt =Integer.parseInt(s.nextLine());
		if(amt>0 && amt%100==0) {
			Balance b1 = new Balance();
			WithDraw wd = new WithDraw(b1);
		}
		else {
			System.out.println("Invalid amt");
		}
		
		
	}

}
