package test;
@SuppressWarnings("serial")
public class CClass extends PClass{
	public CClass() {}
	public CClass(String msg) {
		super(msg);
	}
	@ Override
	public void calculate (int x) throws CClass{
		try {
			if(x==0)
			{
		throw new CClass("only nonzero value");
	}
	System.out.println("Cube:" +Math.pow(x,3));
}catch (CClass ob) {
	throw ob;
}
}


}
