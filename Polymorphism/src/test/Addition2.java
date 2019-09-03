package test;
public class Addition2 {
	public void add(int...x)//var-args
	{
		int sum=0;
		System.out.print("\nEle : ");
		for(int i : x) //Extended for
		{
			System.out.print(i+" ");
			sum=sum+i;
		}//end of for
		System.out.println("===>"+sum);
	}
	
	
	
}
