package maccess;

public class DTypeCase {
	public static void main(String[] args) {
		char ch1 = 'A';
		int k = (int)ch1; //widening process'
		int z = 84;
		char ch2 = (char)z; //Narrowing process
		System.out.println("The ASCII val of A:" +k);
		System.out.println("char at val 84:" +ch2);
	}

}
