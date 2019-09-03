package maccess;
import java.util.*;
public class DString2 {
	public static void main(String[] args) {
		try(Scanner s= new Scanner(System.in);){
			System.out.println("Enter the string");
			String str = s.nextLine();
			int count = 0;
			for(int i = 0; i<str.length();i++) {
				switch(str.charAt(i))
				{
				case'a':
				case 'A':count++;
				break;
				case'e':
				case 'E':count++;
				break;
				case'i':
				case 'I':count++;
				break;
				case'o':
				case 'O':count++;
				break;
				case'u':
				case 'U':count++;
				break;
				}//end of Switch
			}//end of loop
			System.out.println("no of vowels:" +count);
		}//end of try
	}

}
