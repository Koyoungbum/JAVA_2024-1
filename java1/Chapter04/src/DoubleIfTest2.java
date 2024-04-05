/*
 * 작성일 : 2024년 3월 19일
 * 작성자 : 컴퓨터 소프트웨어 공학과 202095006학번 고영범
 * 설명 : 이중 if 문 실습.
 * 		 하나의 정수를 입력 받아 짝수인지 홀수인지 확인하는 프로그램.
 * 
 * 문제분석 :	짝수 => 2로 나눈 나머지가 0이다.
 * 			홀수 => 2로 나눈 나머지가 1이다. (0이 아니다)
 * 			짝수 아니면 홀수이다.
 * 			홀수 아니면 짝수이다.
 * 
 * 알고리즘 :	1.정수를 입력 받는다.
 * 		    2.입력받은 정수가 짝수인지 판단한다.
 * 				2-1."00는 짝수입니다." 출력한다.
 * 			3.아닌 경우 "00는 홀수입니다." 출력한다.
 *  
 */

import java.util.Scanner;

public class DoubleIfTest2 {
	public static void main(String[] args) {
		
		System.out.print("정수 입력: ");
		
		Scanner stdIn = new Scanner(System.in);
		
		int num = stdIn.nextInt();
		
		if ( num %2 == 0) {
			System.out.println(num + "은 짝수입니다.");
		}
		else {
			System.out.println(num + "은 홀수입니다.");
		}
	}

}
