package kr.gudi.s1104;

public class 클래스 {

	public static void main(String[] args) {
		int cu = 200;
		int e7 = 100;
		int 나 = 5000;
		int a, b;
		
		// CU 편의점에서 갯수는?
		if(true) {
			a = (나 / cu);
			System.out.println(a);
		}
		
		// 세븐 편의점에서 갯수는?
		if(true) {
			b = (나 / e7);
			System.out.println(b);
		}
		
		// 나는 어느 편의점에서 구매를 할것인가?
		if(a > b) {
			System.out.println("CU 편의점에 가자!!");
		} else {
			System.out.println("세븐 편의점에 가자!!");
		}
	}

}
