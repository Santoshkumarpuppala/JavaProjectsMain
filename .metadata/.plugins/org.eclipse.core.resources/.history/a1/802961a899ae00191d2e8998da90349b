package maccess;
import java.util.*;
import test.Book;
public class DList1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book> a1 = new ArrayList<Book>();
		a1.add(new Book("A111","CJ"));
		a1.add(new Book("A222","HJ"));
		a1.add(new Book("A333","CJ"));
		System.out.println(a1.toString());
		System.out.println("------ListIterator<E>----");
		ListIterator<Book> li = a1.listIterator();
		System.out.println("----Forward----");
		while(li.hasNext()) {
			System.out.println((Book)li.next()+" ");
		}//end of loop
		System.out.println("\n----Backward-----");
		while(li.hasPrevious()) {
			System.out.println((Book)li.previous()+" ");
		}//end of while
		System.out.println("\n----Foreach()----");
		a1.forEach((k)->
		{
			System.out.println(k+" ");
		});
		
		
		

	}

}
