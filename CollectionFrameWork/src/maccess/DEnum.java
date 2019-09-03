package maccess;
import test.Cars;
public class DEnum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("====Dis from Enum<E>====");
		for(Cars c : Cars.values()){
			System.out.println(c+"Costs"+c.getPrice()+"Thousands of dollars");
		}//end of loop

	}

}
