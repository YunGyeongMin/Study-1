package kr.gudi.s1104;

public class 조건문1 {

	public static void main(String[] args) {
		/* 100 ~ 91 : A학점
		 * 90 ~ 81  : B학점 
		 * 80 ~ 71  : C학점
		 * 70 ~ 61  : D학점
		 * 60 이하      : F학점
		 * 
		 * 입력 받은 값은 78점이면 학점은 무엇인가?
		 ************************************/
		int 입력값 = 101;
//		if(입력값 > 100) {
//			System.out.println("입력값은 잘못되었다.");
//			return;
//		} else if(입력값 < 0) {
//			System.out.println("입력값은 잘못되었다.");
//			return;
//		}
		if(입력값 > 90 && 입력값 <= 100) {
			System.out.println("A학점");
		} else if(입력값 > 80 && 입력값 <= 90) {
			System.out.println("B학점");
		} else if(입력값 > 70 && 입력값 <= 80) {
			System.out.println("C학점");
		} else if(입력값 > 60 && 입력값 <= 70) {
			System.out.println("D학점");
		} else if(입력값 >= 0 && 입력값 <= 60) {
			System.out.println("F학점");
		} else {
			System.out.println("입력값은 잘못되었다.");
		}
		
	}

}
