package test;
public interface ITest {
	default void m1 (int x) throws Exception{
	try {
		if(x==0) //Exception
		{
			throw new Exception("only Non Zero val");
		}
		System.out.println("THe val x:" +x);
	}catch(Exception e) {
		throw e;
	}
	}//end of deault
	static void m2(int y) throws Exception{
		try {
			if(y==0) //Exception
			{
				throw new Exception("only non zer val");
			}
			System.out.println("THe val y" +y);
		}catch(Exception e) {
			throw e;
			
		}
	}//end of static
	
}
