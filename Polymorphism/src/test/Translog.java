package test;
import java.util.*;
public final class Translog {
	private final double tId;
	private final long bAccNo;
	private final int amt;
	private final Date d;
	public Translog(double tId, long bAccNo, int amt,Date d) {
		this.tId=tId;
		this.bAccNo=bAccNo;
		this.amt = amt;
		this.d = d;
	}
	public final void getLog() {
		System.out.println("tId:"+tId+ "\nbAccNO" +bAccNo+"\namt" +amt +"new Date"+d);
		
	}
	

}
