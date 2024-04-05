/*
 * 작성일 : 2024년 4월 5일
 * 작성자 : 컴퓨터 소프트웨어 공학과 202095006학번 고영범
 * 설명 : 조건식 연습
 * 		 월을 입력받아 해당 계절을 출력하시오.
 * 		 3,4,5월 => 봄
 * 		 6,7,8월 => 여름
 * 		 9,10,11월 => 가을
 * 		 12,1,2월 => 겨울
 * 
 * 문제분석 :	입력 받아야할 값 => 월(month)
 * 			입력 받은 값이  
 * 알고리즘 :	
 */

import java.util.Scanner;

public class DoWhileTest2 {

	public static void main(String[] args) {
		// Scanner 객체 생성.
		Scanner stdIn = new Scanner(System.in);
		
		int month;
		
		
		do {
			// 1. 정수를 입력 받는다.
			System.out.print("월을 입력하시오(종료:0 : ");
			month = stdIn.nextInt();
			// 2. 스위치문
			switch (month) 
			{
				// if (month == 3 || month == 3 || month == 5)
			case 3 : case 4 : case 5 :
				System.out.println("봄입니다.");
				break;
				
			case 6 : case 7 : case 8 :
				System.out.println("여름입니다.");
				break;
				
			case 9 : case 10 : case 11 :
				System.out.println("가을입니다.");
				break;
				
			case 12 : case 1 : case 2 :
				System.out.println("겨울입니다.");
				break;
			case 0:
				System.out.println("프로그램 종료");
				break;
			default :
				System.out.println("해당 월은 없습니다.");
				break;
			}
		}while(month!=0); //입력받은 month가 0이아니면 반복 0이면 반복문 종료
	}

}
