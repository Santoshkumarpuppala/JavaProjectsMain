package maccess;
public class DArray1 {
	public static void main(String[] args) {
		Integer i[] = new Integer[3];
		i[0]=new Integer(12);
		i[1]=new Integer(19);
		i[2]=new Integer(11);
		System.out.println("-----Dis Array object------");
		for(Integer k : i)//Extended for
		{
			System.out.println(k+" ");
		}//end of loop
	
		
	}

}
