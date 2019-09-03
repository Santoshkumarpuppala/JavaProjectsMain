package maccess;
import java.util.*;
public class DStack {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<Integer>();
		st.push(new Integer(11));
		st.push(new Integer(13));
		st.push(new Integer(12));
		st.push(new Integer(10));
		System.out.println("peek element:" +st.peek());
		System.out.println("pos of 10:"+st.search(10));
		st.pop();
		System.out.println(st);
		System.out.println("peek element:"+st.peek());
	}

}
