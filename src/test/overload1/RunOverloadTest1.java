package test.overload1;

public class RunOverloadTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadTest1 ot1 = new MethodOverloadTest1();
		
		int n1 = 150;
		int n2 = 3;
		
		System.out.printf("%d*%d = %d\n", n1, n2, ot1.calc(n1, n2));
		
		int n3= 30;
		int n4 = 50;
		int n5 = 100;
		
		System.out.printf("%d+%d = %d\n", n3, n4, n5, ot1.calc(n3, n4, n5));
		
	}

}
