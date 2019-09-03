package maccess;
public class DString4 {
	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "java";
		String s3 = new String("java");
		String s4 = new String("java");
		System.out.println("----------String literal process");
		if(s1==s2) {
			System.out.println("Strings are equal..");
		}else {
			System.out.println("Strings are not Equal");
		}
		System.out.println("---newOPerator process----");
		if(s3==s4) {
			System.out.println("Strings are equal");
		}else {
			System.out.println("Strings are not equal...");
		}
	}

}
