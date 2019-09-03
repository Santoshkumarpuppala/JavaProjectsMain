package maccess;
public class DWrapperClass5 {
	public static void main(String[] args) {
		//Boxing process
		Integer ob1 = new Integer(12);
		Float ob2 = new Float(12.34F);
		Character ob3 = new Character('A');
		Boolean ob4 = new Boolean(true);
		//unboxing process
		int i = ob1.intValue();
		float f= ob2.floatValue();
		char ch = ob3.charValue();
		boolean b = ob4.booleanValue();
		System.out.println("----Dis values------");
		System.out.println("i:" +i);
		System.out.println("f:" +f);
		System.out.println("ch:" +ch);
		System.out.println("b:" +b);
	}

}
