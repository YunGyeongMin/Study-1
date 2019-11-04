package kr.gudi.s1104;

public class 조건문1 {

	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		int c = 4;
		// a / b 결과값을 c와 비교하여 참인지 거짓인지 알아봅시다.
		/********************************************
		 * 1 : a / b 의 결과값
		 * 2 : 결과값과 c 비교
		 * 3 : 참 거짓에 대한 출력하기
		 ********************************************/
		int 결과값 = a / b;
		boolean 비교값 = 결과값 > c;  // 결과값이 c 보다 크다 (참)
		if(비교값) {
			System.out.println("결과값이 c보다 크다");
		} else {
			System.out.println("결과값이 c보다 작다");
		}
	}

}
