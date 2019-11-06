package kr.gudi.s1106;

public class 클래스 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		}
		
//		단(1);
	}
	
	public static void 단(int i) {
		if(i > 9) return;
		증가연산(i, 1);
		단(++i);
	}
	
	public static void 증가연산(int i, int j) {
		if(j > 9) return;
		System.out.println(i + " * " + j + " = " + (i * j));
		증가연산(i, ++j);
	}

}
