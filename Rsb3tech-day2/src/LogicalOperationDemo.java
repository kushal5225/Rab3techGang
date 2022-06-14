
public class LogicalOperationDemo {

	public static void main(String[] args) {
	//LogicalOperation
		int a=8, b=5, c=2;
		
		//and operation
		System.out.println(a>b && b>c);
		System.out.println(a<b && b<c);
		
		//Or operation
		System.out.println(a<b || b<c);
		System.out.println(a>b || b<c);
		
		//Reverse operation
		System.out.println(!(a<b));
		
		
	}

}
