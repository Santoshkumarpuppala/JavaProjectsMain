package test;

public interface ITest1 {
	public interface ITest2{
		public abstract void m2();
	}//InnerInterface
	public class SubClass2 implements ITest2{
		public void m2() {
			System.out.println("--------m2()------");
		}
		
	}//Innerclass
public static final SubClass2 ob2 = new SubClass2();

}//outerInterface
