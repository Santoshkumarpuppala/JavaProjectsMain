package maccess;
import java.io.*;
public class DFile1 {
	public static void main(String[] args)
		// TODO Auto-generated method stub
		throws IOException{
			DataInputStream dis = new DataInputStream(System.in);
			System.out.println("Enter the fPath&fName(Source)");
			File f1 = new File(dis.readLine());
			System.out.println("Enter the fPath&fName(destination)");
			File f2 = new File(dis.readLine());
			FileInputStream fis = new FileInputStream(f1);
			FileOutputStream fos = new FileOutputStream(f2);
			int i;
			while((i=fis.read())!=-1) {
				fos.write(i);
			}
			System.out.println("FIle copied Successfully");
		fis.close();
		fos.close();			
		}
	}
