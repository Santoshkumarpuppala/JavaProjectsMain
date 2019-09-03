package p1;

public class PinCheck {
	public boolean k;
	public boolean verify(int PinNo)
	{
		switch(PinNo)
		{
		case 1111: k = true;
		break;
		case 2222: k =true;
		break;
		default : k = false;
		}
		return(k);
	}
}
		

