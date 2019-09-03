package maccess;
import java.util.*;
public class DQueue {
	public static void main(String[] args) {
		System.out.println("-------PriorityQueue<E>-----");
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(new Integer(11));
		pq.add(new Integer(13));
		pq.add(new Integer(14));
		System.out.println(pq);
		System.out.println("------ArrayDeque------");
		ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
		ad.add(new Integer(12));
		ad.add(new Integer(13));
		ad.add(new Integer(14));
		System.out.println(ad);
		ad.addFirst(new Integer(12));
		ad.addLast(new Integer(12));
		System.out.println(ad);
		}

}
