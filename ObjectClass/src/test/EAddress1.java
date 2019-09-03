package test;
public class EAddress1 implements Cloneable {
	public String hNo="12-34/h";
	public Object process() {
		Object o = null;
		try {
			o=this.clone();
		}catch(CloneNotSupportedException ob) {}
		return o;
	}
}
