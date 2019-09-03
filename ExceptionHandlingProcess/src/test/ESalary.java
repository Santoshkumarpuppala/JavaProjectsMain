package test;
@SuppressWarnings("serial")

public class ESalary extends Exception{
public int bsal;
public float totsal;
public ESalary() {}
public ESalary(String msg) {
	super(msg);
}
public void verify(int bsal) throws ESalary{
	try {
		if(bsal<5000)
		{
			throw new ESalary("Invalid bsal");
		}
		this.bsal=bsal;
		totsal=bsal+(0.93F*bsal)+(0.67f*bsal);
	}catch(ESalary es) {
		throw es; //rethrowing		
	}
}//end of verify
public void getSalary() {
	System.out.println("bsal" +bsal);
	System.out.println("totalsal" +totsal);
}

}
