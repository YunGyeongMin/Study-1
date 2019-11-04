package kr.gudi.s1104;

public class 조건문1 {

	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		int c = 4;
		// a / b 결과값을 c와 비교하여 참인지 거짓인지 알아봅시다.
		/* 비교자 종류 (논리형 데이터 출력)
		 * >  : 앞에 있는 값이 뒤에 있는 값 보다 크다
		 * <  : 앞에 있는 값이 뒤에 있는 값 보다 작다
		 * >= : 앞에 있는 값이 뒤에 있는 값 보다 크거나 같다
		 * <= : 앞에 있는 값이 뒤에 있는 값 보다 작거나 같다
		 * == : 같다
		 ********************************************/
		if((a / b) > c) {
			System.out.println("결과값이 c보다 크다");
		} else {
			System.out.println("결과값이 c보다 작다");
		}
	}

}
