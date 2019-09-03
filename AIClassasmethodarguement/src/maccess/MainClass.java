package maccess;
import test.IComparable;
import test.Display;
import java.util.Scanner;
public class MainClass{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		Display d1 = new Display();
		System.out.println("Enter the value1:");
		int v1 = Integer.parseInt(s.nextLine());
		System.out.println("Enter the value2:");
		int v2 = Integer.parseInt(s.nextLine());
		System.out.println("--Choice---");
		System.out.println("1.Greater\n2. Smaller");
		System.out.println("ENter the choice");
		switch(Choice)
		{
		case 1: //greater
		d1.dis(v1,v2, new IComparable()
				{
			public int CompareTo(int x, int y)
			{
				if(x>y) return x;
				else return y;
			}
		)}; //method call
		break ;
		case 2: //smaller
			d1.dis(v1,v2, new IComparable()
					{
				public int compareTo(int x, int y)
				{
					if (x<y) return x; 
					else 
						return y;
					)};
					break;
					default:
						System.out.println("Ivalid Choice:");
	} //end of switch
	s.close();
		}
}
		
		

