package test.overload1;

public class MethodOverloadTest1 {
//매개변수를 이용한 오버로딩
	public int calc(int n1, int n2) {
		return n1*n2;
	}
	
	public int calc(int n1, int n2, int n3) {
		return n1+n2+n3;
		
	}
}
