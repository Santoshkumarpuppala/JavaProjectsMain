package test;
public class Book {
	public String bCode, bName;
	public Book(String bCode, String bName) {
		this.bCode=bCode;
		this.bCode=bName;
	}
	@ Override
	public String toString() {
		return bCode+"\t" +bName;
	}

}
