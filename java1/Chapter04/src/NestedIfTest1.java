/*
 * 작성일 : 2024년 3월 22일
 * 작성자 : 컴퓨터 소프트웨어 공학과 202095006학번 고영범
 * 설명 : 내포된 if 문 실습.
 * 		 점수를 입력받아 학점을 출력하시오.
 * 		 점수는 0~100점 사이입니다.
 * 		 점수 범위를 벗어나면 "잘못된 점수입니다." 출력하시오.
 * 
 * 문제분석 :	입력받은 점수가 0~100점 사이인가?
 * 			점수가 0~100점 사이가 아니면? 
 * 			90점 이상이면 A학점
 * 			80점 이상이면 B학점
 * 			70점 이상이면 C학점
 * 			60점 이상이면 D학점
 * 			60점 미만이면 F학점
 * 			점수는 정수로 입력 받는다.
 * 
 * 알고리즘 :	1. 점수(정수)를 잉ㅂ력받는다.
 * 			2. 점수의 범위가 0~100 사이인가?
 * 				1) A
 * 				2) B
 * 				   :
 * 			3. else 아닌가?
 * 				1) "잘못된 점수입니다." 출력
 */

import java.util.Scanner;

public class NestedIfTest1 {

	public static void main(String[] args) {
		
		System.out.print("점수 입력: ");
		
		Scanner stdIn = new Scanner(System.in);
		int num = stdIn.nextInt();
		
		if (num >= 0 && num <= 100) {
			if( num >= 90) {// 90점 이상이고, 100점 이하
				System.out.println("A학점 입니다.");
			}
			else if(num >= 80) {
				System.out.println("B학점 입니다.");
			}
			else if(num >= 70) {
				System.out.println("C학점 입니다.");
			}
			else if(num >= 60) {
				System.out.println("D학점 입니다.");
			}
			else {
				System.out.println("F학점 입니다.");
			}
		}
		else {
			System.out.println("잘못된 점수입니다.");
		}
		
	}

}
