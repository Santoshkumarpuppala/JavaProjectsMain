package test;
@SuppressWarnings("serial")
public class EAddress extends Exception {
	public String hNo,sName, city;
	public int pinCode;
	public EAddress() {}
	public EAddress(String msg) {
		super(msg);
	}
	public void verify(String hNo, String sName, String city, int pinCode) throws EAddress{
		try {
			if(hNo.length()==0||sName.length()==0||city.length()==0||pinCode==0) {
				throw new EAddress ("Fill all the address details");
			}
			this.hNo=hNo;
			this.sName=sName;
			this.city=city;
			this.pinCode=pinCode;
		}catch(EAddress ea) {
			throw ea;//rethrowing
		}
	}//end of verify
	public void getAddress() {
		System.out.println("hNo:"+hNo);
		System.out.println("sName"+sName);
		System.out.println("city:" +city);
		System.out.println("pinCode" +pinCode);
	}
}
