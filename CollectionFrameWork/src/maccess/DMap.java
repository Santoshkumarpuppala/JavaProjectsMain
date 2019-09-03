package maccess;
import java.util.*;
import test.Product;
public class DMap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Product> hm = new HashMap<String, Product>();
		hm.put("A111", new Product("Mouse",12));
		hm.put("A222", new Product("KB",15));
		hm.put("A333", new Product("CDR",117));
		System.out.println(hm);
		System.out.println("-------forEach()------");
		hm.forEach((p,q)->
		{
			System.out.println(p+"\t"+q);
		});
		System.out.println("----keys------");
		Set<String> st = hm.keySet();
		System.out.println(st);
		System.out.println("------values-------");
		Collection<Product> c = hm.values();
		System.out.println(c);

	}

}
