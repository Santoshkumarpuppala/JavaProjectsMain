package maccess;
public class DString7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		System.out.println("Default Capacity:" +sb.capacity());
		System.out.println("length:" +sb.length());
		sb.append("java");
		sb.append("program");
		System.out.println("sb:" +sb.toString());
		sb.insert(4, "language");
		System.out.println("sb:" +sb.toString());
		System.out.println("capacity:" +sb.capacity());
		System.out.println("length:" +sb.length());
		System.out.println("Reverse:" +sb.reverse());
	}

}