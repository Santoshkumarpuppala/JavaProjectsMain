package maccess;
public class DArray4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a1[]= {1,2,3};
		Integer a2[]= {101,102,103,104};
		Integer a3[]= {201,202,203,204,205};
		Integer a[][]= {a1,a2,a3};
		System.out.println("------Dis from jagged Array----");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.println(a[i][j]+" ");
			}
			System.out.println("\n");
		}//outerloop
		System.out.println("-----Dis from jagged array");
		for(Integer[] i :a) {
			for(Integer j : i) {
				System.out.println(j+" ");
			}//innerloop
			System.out.println("\n");
		}//outerloop

	}

}
