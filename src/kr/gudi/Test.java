package kr.gudi;

public class Test {

	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		덧셈(a,b);
		뺄셈(a,b);
	}
	
	public static void 덧셈(int a, int b) {
		int c = a + b;
		System.out.println(a + " + " + b + " = " + c);
	}
	
	public static void 뺄셈(int a, int b) {
		int d = a - b;
		System.out.println(a + " - " + b + " = " + d);
	}
	
}
