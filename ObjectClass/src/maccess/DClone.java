package maccess;
import test.Book;
public class DClone {
	public static void main(String[] args) {
		// Original object
		System.out.println("----Original Object----");
		Book b1 = new Book("A121", "CoreJava");
		System.out.println(b1.toString());
		System.out.println("b1:" +b1.hashCode());
		System.out.println("----Cloned object---");
		//Cloned object
		Book b2 = (Book)b1.process(); //step4 (typecasting)
		System.out.println(b2.toString());
		System.out.println("b2:" +b2.hashCode());

	}

}
