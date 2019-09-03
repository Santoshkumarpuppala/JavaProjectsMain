package test;
public enum Cars {
	Figo(900),Dezire(700),Alto(500);
	public int price;
	private Cars(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}

}
