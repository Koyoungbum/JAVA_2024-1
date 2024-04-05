/*
 * 작성일 : 2024년 3월 19일
 * 작성자 : 컴퓨터 소프트웨어 공학과 202095006학번 고영범
 * 설명 : 이중 if 문 실습.
 * 		 하나의 정수를 입력 받아 음수인지 양수인지 0인지 확인하는 프로그램.
 * 
 * 문제분석 :	음수는 0보다 작은수이다.
 * 		    정수를 입력받아 0보다 작은지 비교,판단.
 * 			양수는 0보다 큰 수이다.
 * 			입력 받은 정수가 0보다 큰지 판단.
 * 			0은 0이다.
 * 
 * 알고리즘 :	1.정수를 입력 받는다.
 * 		    2.만약에 입력받은 정수가 0보다 작은가?
 * 				2-1."-0은 음수입니다." 출력한다.
 * 			3.아니고, 만약에 입력받은 정수가 0보다 큰가?
 * 				3-1." 0은 양수입니다." 출력한다.
 *  		4.아니면(나머지는)
 *  			4-1. 0입니다.
 */

import java.util.Scanner;

public class MultiIfTest1 {
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		// 1. 정수를 입력 받는다.
		System.out.print("정수 입력 : ");
		int num = stdIn.nextInt();
		
		/* 2. 음수인지 판단.
		 * 만약에 변수에 저장된 값이 0보다 작으면..
		*/
		if(num < 0) {
		System.out.println(num + "은(는) 음수입니다.");	
		} // if 종료 지점.
		
		// 3. 아니면 양수인지 판단.
		else if(num > 0) {
			System.out.println(num + "은(는) 양수입니다.");	
		}
		
		// 4. 아니면(0이다. num == 0)
		else { 
			System.out.println(num + "은(는) 0입니다.");	
		} // else 종료.
				
		// 조건과 상관없이 무조건 출력되는 문장.
		System.out.println("프로그램 종료");
		}
		
	}
