package test;

public class SubClass111 {
	public int a=10;
	public static int b = 20;
	public void m1() {
		class SubClass222{
			public void m2() {
System.out.println("---------m2()-----");
System.out.println("The val a:" +a);
System.out.println("THe val b:" +b);

			}
		} //local inner class
	SubClass222 ob2 = new SubClass222(); ///innerclass obj
	ob2.m2(); //methodcall
	}

}
