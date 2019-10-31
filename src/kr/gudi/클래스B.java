package kr.gudi;

public class 클래스B {
	
	int count = 0;
	int end = 1000;
	
	public 클래스B() {
//		매소드A();
		반복매소드();
	}
	
	public void 반복매소드() {
		count = count + 1;
		if(count > end) {return;}		
		System.out.println("매소드 호출 : " + count);
		반복매소드();
	}
	
	public void 매소드A() {
		count = count + 1;
		if(count > end) {return;}		
		System.out.println("매소드A 호출 : " + count);
		매소드B();
	}
	
	public void 매소드B() {
		count = count + 1;
		if(count > end) {return;}		
		System.out.println("매소드B 호출 : " + count);
		매소드A();
	}

}
