package test;

public interface ITest1 {
	public static class SubClass22{
		public void m1() {
			System.out.println("-----m1()-----");
		}
		public static void m2() {
			System.out.println("------m2()-----");
		}
	}//InnerClass
public static final SubClass22 ob2 = new SubClass22(); //Innerclass obj

} //Outer Interface.
