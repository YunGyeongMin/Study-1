package kr.gudi.s1106;

public class 클래스 {

	public static void main(String[] args) {
		
		int a = 0;
		for(;true;) 
		{ 
			if(a >= 5) break;
			System.out.println("for문 : " + a);
			a++;
		}
		
		a = 0;
		while(true) {
			if(a >= 5) break;
			System.out.println("while문 : " + a);
			a++;
		}
	}

}
