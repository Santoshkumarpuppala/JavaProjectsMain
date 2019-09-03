package test;
public class Product {
	public String pName;
	public int pQty;
	public Product(String pName, int pQty) {
		this.pName=pName;
		this.pQty=pQty;
	}
	@Override
	public String toString() {
		return pName+"\t"+pQty;
	}

}
