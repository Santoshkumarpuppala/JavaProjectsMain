package test;
public class Employee1 implements Cloneable {
	public String eName="Raj";
	public EAddress1 ea = new EAddress1(); //Tightly coupled reference
	@ Override
	public String toString() {
		return "eName:" +eName+"\nhNo:"+ea.hNo;
	}
	public Object process() {
		Employee1 o = null;
		try {
		 o=(Employee1)this.clone();
		 o.ea=(EAddress1)o.ea.process();
		}catch(CloneNotSupportedException ob) {}
		return o;
	}
}
