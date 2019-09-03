package maccess;
import java.util.Scanner;
import p1.PinCheck;
import p4.*;
public class Bank //main class
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int count = 0;
		xyz: //Label 
		while (true)
		{
			System.out.println("Enter the pinNo");
			String pinNo = s.nextLine();
			if(pinNo.length()==4)
			{
				PinCheck pc =new PinCheck();
				boolean k = pc.verify(Integer.parseInt(pinNo));
				if(k)
				{
					System.out.println("----Choice------");
					System.out.println("1.WithDraw\n2.Payement\n3.Deposit");
					System.out.println("Enter the Choice");
					int choice = Integer.parseInt(s.nextLine());
						switch(choice)
						{
						case 1: //WithDraw
					WithDraw wd = new WithDraw();
					System.out.println("Enter the amt:");
					int a1 = Integer.parseInt(s.nextLine());
						if(a1>0 && a1%100 == 0)
							{
						wd.process(a1); //method call
							}//end od if
							else
							{
						System.out.println("Invlalid amt");
							}
							break xyz;
							case 2: //payement
							Payment p1 =new Payment();
							System.out.println("Enter the amt:");
							float a2 = Float.parseFloat(s.nextLine());
							if(a2>0)
							{
							p1.process(a2); //method call
							} //end od if
							else
							{
							System.out.println("invalid amt");
							}
							break xyz;
							case 3: //Deposit
							Deposit d1 = new Deposit();
							System.out.println("Enter the amt:");
							int a3  = Integer.parseInt(s.nextLine());
							if(a3>0 && a3%100 == 0)
							{
								d1.process(a3); //method call
							}
							else
							{
							System.out.println("Invaid amt");
							}
							break xyz;
							default:
								System.out.println("Invalid choice");
							break xyz;
							} //end fo swhitch
				}
				else
				{
					System.out.println("pin No Do not exist");
					count ++;
				}
			} //end of if
			else
			{
				System.out.println("Invalid ppinno");
				count++;
			}
			if(count==3) //simple if
			{
			System.out.println("sorry! transaction blocked..");
			break xyz;
			}
		}
	}
}

