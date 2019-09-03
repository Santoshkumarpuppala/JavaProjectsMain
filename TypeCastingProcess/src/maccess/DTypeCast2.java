package maccess;
import test.*;
public class DTypeCast2 {
	public static void main(String[] args) {
		CClass ob = (CClass)new PClass();
		ob.m();
	}

}
