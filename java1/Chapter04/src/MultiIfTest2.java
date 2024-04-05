/*
 * 작성일 : 2024년 3월 19일
 * 작성자 : 컴퓨터 소프트웨어 공학과 202095006학번 고영범
 * 설명 : 다중 if 문 실습.
 * 		 점수를 입력받아 학점을 출력하시오.
 * 
 * 문제분석 :	90점 이상이면 A학점
 * 			80점 이상이면 B학점
 * 			70점 이상이면 C학점
 * 			60점 이상이면 D학점
 * 			60점 미만이면 F학점
 * 			점수는 정수로 입력 받는다.
 * 
 * 알고리즘 :	1.점수(정수)를 입력 받는다.
 * 		    2.입력받은 점수가 90점 이상인지 판단한다.
 * 				2-1."A학점입니다." 출력한다.
 * 			3.아니면 80점 이상인지 판단한다.
 * 				3-1."B학점입니다." 출력한다.
 * 			4.아니면 70점 이상인지 판단한다.
 * 				4-1."C학점입니다." 출력한다.
 * 			5.아니면 60점 이상인지 판단한다.
 * 				5-1."D학점입니다." 출력한다.
 *  		6.아니면 (나머지는,60점 미만)인지 판단한다.
 * 				6-1."F학점입니다." 출력한다.
 */

import java.util.Scanner;

public class MultiIfTest2 {
	public static void main(String[] arg) {
		
		System.out.print("점수 입력: ");
		
		Scanner stdIn = new Scanner(System.in);
		
		int num = stdIn.nextInt();
		
		if( num >= 90 && num <= 100) {// 90점 이상이고, 100점 이하
			System.out.println("A학점 입니다.");
		}
		else if(num >= 80 && num <= 90) {
			System.out.println("B학점 입니다.");
		}
		else if(num >= 70 && num <= 80) {
			System.out.println("C학점 입니다.");
		}
		else if(num >= 60 && num <= 70) {
			System.out.println("D학점 입니다.");
		}
		else if(num >= 0 && num <= 60) {
			System.out.println("F학점 입니다.");
		}
		else {
			System.out.println("잘못된 점수 입력입니다.");
		}
	}
}
