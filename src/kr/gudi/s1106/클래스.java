package kr.gudi.s1106;

import java.util.Scanner;

public class 클래스 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("구구단 열의 갯수를 입력하세요.");
			int 열 = scan.nextInt();
			if(열 == 0) break;
			for(int i = 1; i <= 9; i = i + 열) {
				for(int j = 1; j <= 9; j++) {
					String 행 = "";
					for(int c = 0; c < 열; c++) {
						if((i+c) > 9) break;
						행 += (i+c) + " * " + j + " = " + ((i+c) * j) + "\t";
					}
	//				String a = (i+0) + " * " + j + " = " + ((i+0) * j);
	//				String b = (i+1) + " * " + j + " = " + ((i+1) * j);
	//				String c = (i+2) + " * " + j + " = " + ((i+2) * j);
					System.out.println(행);
					
				}
			}
		}
		
	}
	
}
