package kr.gudi.s1107;

public class 클래스 {

	public static void main(String[] args) {
		String 도형1 = "■";
		String 도형2 = " ";
																		 	// 도형1	도형2
//		System.out.println(도형1+도형1+도형1+도형1+도형1+도형1+도형1+도형1+도형1); 	//  9	0	= 9 > 0
//		System.out.println(도형2+도형1+도형1+도형1+도형1+도형1+도형1+도형1+도형2); 	//	7	2	= 9 > 8
//		System.out.println(도형2+도형2+도형1+도형1+도형1+도형1+도형1+도형2+도형2); 	//	5	4	= 9 > 7
//		System.out.println(도형2+도형2+도형2+도형1+도형1+도형1+도형2+도형2+도형2); 	//	3	6	= 9 > 6
//		System.out.println(도형2+도형2+도형2+도형2+도형1+도형2+도형2+도형2+도형2); 	//	1	8	= 9 > 5

		for(int i = 0; i < 5; i++) {
			
			for(int j = 0; j < 9; j++) {
				int 도형2크기 = ((i * 2) / 2);  // 2
				int 도형1크기  = ((9 - (i * 2)) + 도형2크기); // 9 - 4 = 5 + 2 > 7
				if(도형2크기 <= j && 도형1크기 > j) {
					System.out.print(도형1);
				} else {
					System.out.print(도형2);
				}
			}
			System.out.println("");
			
		}
		
	}

}
