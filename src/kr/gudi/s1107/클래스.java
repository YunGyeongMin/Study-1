package kr.gudi.s1107;

public class 클래스 {

	public static void main(String[] args) {
		String 도형1 = "■";
		String 도형2 = " ";
		int i = 0;
									   //  0  1  2  3  4  5  6  7  8
 		String[] 배열1 = new String[9]; // ["","","","","","","","",""]
		배열1[0] = 도형1;
		배열1[1] = 도형1;
		배열1[2] = 도형1;
		배열1[3] = 도형1;
		배열1[4] = 도형1;
		배열1[5] = 도형1;
		배열1[6] = 도형1;
		배열1[7] = 도형1;
		배열1[8] = 도형1;
		for(; i < 배열1.length; i++) {System.out.print(배열1[i]);}
		System.out.println("");
		String[] 배열2 = new String[9];
		배열2[0] = 도형2;
		배열2[1] = 도형1;
		배열2[2] = 도형1;
		배열2[3] = 도형1;
		배열2[4] = 도형1;
		배열2[5] = 도형1;
		배열2[6] = 도형1;
		배열2[7] = 도형1;
		배열2[8] = 도형2;
		for(i = 0; i < 배열2.length; i++) {System.out.print(배열2[i]);}
		
																		 	// 도형1	도형2
//		System.out.println(도형1+도형1+도형1+도형1+도형1+도형1+도형1+도형1+도형1); 	//  9	0	= 9 > 0
//		System.out.println(도형2+도형1+도형1+도형1+도형1+도형1+도형1+도형1+도형2); 	//	7	2	= 9 > 8
//		System.out.println(도형2+도형2+도형1+도형1+도형1+도형1+도형1+도형2+도형2); 	//	5	4	= 9 > 7
//		System.out.println(도형2+도형2+도형2+도형1+도형1+도형1+도형2+도형2+도형2); 	//	3	6	= 9 > 6
//		System.out.println(도형2+도형2+도형2+도형2+도형1+도형2+도형2+도형2+도형2); 	//	1	8	= 9 > 5

//		for(int i = 0; i < 5; i++) {
//			
//			for(int j = 0; j < 9; j++) {
//				int 도형2크기 = ((i * 2) / 2);  // 2
//				int 도형1크기  = ((9 - (i * 2)) + 도형2크기); // 9 - 4 = 5 + 2 > 7
//				if(도형2크기 <= j && 도형1크기 > j) {
//					System.out.print(도형1);
//				} else {
//					System.out.print(도형2);
//				}
//			}
//			System.out.println("");
//			
//		}
		
	}

}
