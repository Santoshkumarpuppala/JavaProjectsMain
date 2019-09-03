package test;
public class StuData {
	public String rollNo, stuName;
	public StuData(String rollNo, String stuName) {
		this.rollNo=rollNo;
		this.stuName=stuName;
	}
	@ Override
	public String toString() {
		return rollNo+"\t"+stuName;
	}
}
