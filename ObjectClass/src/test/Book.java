package test;
public class Book implements Cloneable{ //step1
	public String bCode, bName;
	public Book(String bCode, String bName) {
		this.bCode=bCode;
		this.bName=bName;
	}
	@ Override
	public String toString() {
		return "bCode:"+bCode+"\nbName:"+bName;
	}
	public Object process() { //Step2
		Object o = null;
		try {
			o = this.clone();//Step3
		}catch(CloneNotSupportedException ob) {}
		return o;
	}

}
