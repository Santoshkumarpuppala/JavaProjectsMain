package maccess;
public class DWrapperClass6 {
	public static void main(String[] args) {
		//AutoBoxing process
		Integer ob1 = 12;
		Float ob2 = 12.34F;
		Character ob3 = 'A';
		Boolean ob4 = true;
		// Auto unboxing process
		int i = ob1;
		float f= ob2;
		char ch = ob3;
		boolean b = ob4;
		System.out.println("----Dis values------");
		System.out.println("i:" +i);
		System.out.println("f:" +f);
		System.out.println("ch:" +ch);
		System.out.println("b:" +b);
	}

}
