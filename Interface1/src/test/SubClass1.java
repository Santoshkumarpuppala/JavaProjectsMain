package test;

public class SubClass1 {
	public interface ITest1{
		public abstract void m1();
	}//InnerInterface
	public static interface ITest2{
		public abstract void m2();
	}//InnerInterface
	public class SubClass2 implements ITest1, ITest2{
		public void m1() {
			System.out.println("----m1()---");
		}
		public void m2() {
			System.out.println("----m2()---");
		}
		
	}

}
