package kr.gudi.s1104;

public class 조건문1 {

	public static void main(String[] args) {
		// 홀수면 [O] 짝수면 [X] 1 ~ 10
		int 수 = 1;
		홀짝확인용(수++);
		홀짝확인용(수++);
		홀짝확인용(수++);
		홀짝확인용(수++);
		홀짝확인용(수++);
		홀짝확인용(수++);
		홀짝확인용(수++);
		홀짝확인용(수++);
		홀짝확인용(수++);
		홀짝확인용(수++);
	}
	
	public static void 홀짝확인용(int 수) {
		if(수%2 == 0) {
			System.out.println(수 + " : [X]");
		} else {
			System.out.println(수 + " : [O]");
		}
	}
	
}
