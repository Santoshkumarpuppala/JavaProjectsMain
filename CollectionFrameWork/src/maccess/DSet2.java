package maccess;
import java.util.*;
public class DSet2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <Integer> hs = new HashSet<Integer>();
		hs.add(new Integer(12));//Wrapper class objects
		hs.add(new Integer(19));// " "
		hs.add(new Integer(10));
		hs.add(new Integer(11));
		System.out.println(hs.toString());
		System.out.println("------Iterator<E>------");
		Iterator<Integer> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()+" ");
		}//end of loop
		System.out.println("\n------Spliterator<E>------");
		Spliterator<Integer> sp = hs.spliterator();
		sp.forEachRemaining((k)->//LambdaExpression as Method Argument
		{
			System.out.println(k+" ");
		});
		System.out.println("\n----forEach()------");
		hs.forEach((p)->{
			System.out.println(p+" ");
		});

	}

}
