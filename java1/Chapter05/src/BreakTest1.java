/*
 * 작성일 : 2024년 4월 12일
 * 작성자 : 컴퓨터 소프트웨어 공학과 202095006학번 고영범
 * 설명 : 1부터 입력받은 수까지 합을 출력하시오.
 * 
 * 문제분석 :1+2+3+4+5+6~+입력받은 수
 *  		1부터(초기값)
 *  		입력 받은 수까지(조건식)
 *  		1씩 증가(증감식)
 *  		하면서 합계를 계산한다.
 * 			sum = sum + num 공식
 * 			sum = 0 초기값 지정이 반드시 필요하다.
 * 알고리즘 :
 * 		1. 입력받는 수를 num1로 지정한다.
 * 		2. sum = 0 으로 초기값을 지정한다.
 * 		3. 수는 1부터 (초기값)
 * 		4. while(True)를 이용해서 무한반복을 만든다.
 * 		5. 수는 입력받은 수까지 반복하면서 (조건식) 조건이 만족 되면 무한 반복 탈출
 * 			5-1. 합계를 계산한다.
 * 			5-2. 수를 1씩 증가한다. (증감식)
 * 		6. 합계를 출력한다.
 */

import java.util.Scanner;

public class BreakTest1 {

	public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int num1 = stdIn.nextInt();
		// 1. 입력받는 수를 num1로 지정한다.
		int sum = 0;
		// 2. sum = 0 으로 초기값을 지정한다.
		int i=1; 
		// 3. 초기값 
		while(true) { //4. while(True)를 이용해서 무한반복을 만든다.
			if(i>num1) {break;} // 5. 조건식 만족하면 무한 반복 종료
			
			sum = sum + i; //5-1.합계 계산
			i++; //5-2. 수를 1씩 증가한다.
		}
		System.out.println("1부터 입력받는 수까지 합은 " + sum + "입니다. "); //6. 합계를 출력한다.
	}

}
