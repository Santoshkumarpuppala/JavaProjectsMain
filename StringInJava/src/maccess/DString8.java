package maccess;
import java.util.*;
public class DString8 {
	public static void main(String[] args) {
		try(Scanner s= new Scanner(System.in);){
			System.out.println("Enter the string:");
			String str = s.nextLine();
			StringTokenizer st = new StringTokenizer(str," ");
			System.out.println("----Result----");
			while(st.hasMoreTokens()) {
				StringBuffer sb = new StringBuffer(st.nextToken());
				System.out.print(sb.reverse()+" ");
			}//end of loop
		}//end of try
		
	}
}
