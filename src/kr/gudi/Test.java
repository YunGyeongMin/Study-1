package kr.gudi;

public class Test {
	
	int a;
	int b;
	
	public Test() {}

	public static void main(String[] args) {
		Test test1 = new Test();
		System.out.println(test1.a); // 값을 담기 전 기본값
		test1.a = 5;
		System.out.println(test1.a); // 5의 값 확인
		
		Test test2 = new Test();
		System.out.println(test2.a); // 5의 값 확인
		
//		System.out.println(test1);
//		System.out.println(test2);
	}
	
}
