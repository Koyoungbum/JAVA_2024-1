/*
 * 작성일 : 2024년 3월 15일
 * 작성자 : 컴퓨터 소프트웨어 공학과 202095006학번 고영범
 * 설명 : 3항 연산자.
 * 		 정수를 입력 받아 짝수인지 확인하는 프로그램
 */

import java.util.Scanner;

public class TernaryOpTest {
	
	public static void main(String[] args) {
		// Scanner 객체 생성.
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = stdIn.nextInt();
		
		boolean result;  // true, false
		result = (num % 2 == 0) ? true : false;
		//num을 2로 나눈 나머지가 0일경우 맞으면 짝수 틀리면 홀수
		
		System.out.print(num + "은(는) 짝수 입니까? ");
		System.out.println(result);
	}

}
