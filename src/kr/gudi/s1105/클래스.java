package kr.gudi.s1105;

public class 클래스 {

	public static void main(String[] args) {
		// 조건문!! if문, switch문 중첩이 가능하다.
		String a = "일어난다.";
		String b = "씻는다.";
		String c = "밥 먹는다.";
		String d = "출근한다.";
		String 조합값 = "";
		
		boolean 유형 = false;  // true (밥 먹는 사람) / false (밥 먹지 않는 사람)
		
		switch (1) {
			case 1:
				조합값 += a;
//				System.out.println(조합값);
			case 2:
				조합값 += b;
//				System.out.println(조합값);
			case 3:
				if(유형) {
					조합값 += c;
				}
//				System.out.println(조합값);
			case 4:
				조합값 += d;
//				System.out.println(조합값);
			default:
				System.out.println(조합값);
		}
	}

}
