package maccess;
import test.Employee1;
public class DeepCloning {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-----original objects----");
		//original object
		Employee1 e1 = new Employee1();
		System.out.println(e1);
		System.out.println("e1:"+e1.hashCode());
		System.out.println("ea:"+e1.ea.hashCode());
		System.out.println("----Cloned objects----");
		//cloned objects
		Employee1 e2 = (Employee1)e1.process();
		System.out.println(e2);
		System.out.println("e2:" +e2.hashCode());
		System.out.println("ea:"+e2.ea.hashCode());
	}

}