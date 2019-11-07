package kr.gudi.s1106;

public class 클래스 {

	public static void main(String[] args) {
		
		String 도형 = "■";
		
//		System.out.println(도형);					// i = 0
//		System.out.println(도형+도형);				// i = 1
//		System.out.println(도형+도형+도형);			// i = 2
//		System.out.println(도형+도형+도형+도형);		// i = 3
//		System.out.println(도형+도형+도형+도형+도형);	// i = 4
//		System.out.println(도형+도형+도형+도형);		// i = 5 > 역순 4번 = 9
//		System.out.println(도형+도형+도형);			// i = 6 > 역순 3번 = 9 
//		System.out.println(도형+도형);				// i = 7 > 역순 2번 = 9
//		System.out.println(도형);					// i = 8 > 역순 1번 = 9
		
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j <= i; j++) {
				if((9 - i) <= j) break;
				System.out.print(도형);
			}
			System.out.println("");
		}		
		
	}
	
}
