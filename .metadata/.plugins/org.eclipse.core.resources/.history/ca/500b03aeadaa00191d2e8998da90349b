package test;
public class Employee implements Cloneable {
	public String eName="Raj";
	public EAddress ea = new EAddress(); //Tightly coupled reference
	@ Override
	public String toString() {
		return "eName:" +eName+"\nhNo:"+ea.hNo;
	}
	public Object process() {
		Object o = null;
		try {
			o=this.clone();
		}catch(CloneNotSupportedException ob) {}
		return o;
	}
}
