package maccess;
import test.StuData;
public class DArray2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StuData sd[] = new StuData[3];
		sd[0] = new StuData("A121","Raj");
		sd[1] = new StuData("A122","Ram");
		sd[2] = new StuData("A123","nit");
		System.out.println("----Dis from Array---");
		for(StuData k : sd)//Extended for
		{
			System.out.println(k);
		}//end of loop

	}

}
