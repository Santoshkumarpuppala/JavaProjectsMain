package maccess;
import test.Employee;
public class ShallowCloning {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-----original objects----");
		//original object
		Employee e1 = new Employee();
		System.out.println(e1);
		System.out.println("e1:"+e1.hashCode());
		System.out.println("ea:"+e1.ea.hashCode());
		System.out.println("----Cloned objects----");
		//cloned objects
		Employee e2 = (Employee)e1.process();
		System.out.println(e2);
		System.out.println("e2:" +e2.hashCode());
		System.out.println("ea:"+e2.ea.hashCode());
	}

}
