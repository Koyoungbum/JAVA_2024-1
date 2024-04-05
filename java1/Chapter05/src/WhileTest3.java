/*
 * 작성일 : 2024년 4월 2일
 * 작성자 : 컴퓨터 소프트웨어 공학과 202095006학번 고영범
 * 설명 : 정수를 입력 받아 정수의 팩토리얼 값을 출력하시오.
 * 
 * 문제분석 :
 * 		5! = 5 * 4 * 3 * 2 * 1 => 120
 * 		입력 받은 수 부터 1까지 1씩 감소하면서 
 * 		곱셈의 과정 출력
 * 		팩토리얼 = 팩토리얼 * 수
 * 			5 =   1   * 5
 * 			20 =  5   * 4
 * 			60 =  20  * 3
 * 			120 = 60  * 2
 * 			120 = 120 * 1
 * 알고리즘 :
 * 		1. 수를 입력 받는다.(정수)
 * 		2. fac는 입력받은 수부터 (초기값)
 * 		3. 1까지 반복하면서 (조건식)
 * 			3-1. 팩토리얼 계산식을 출력한다.
 * 			3-2. 곱하는 수를 1씩 감소시킨다. (증감식)
 * 		4. 팩토리얼 값을 출력한다.
 */

import java.util.Scanner;

public class WhileTest3 {

	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner stdIn = new Scanner(System.in);
		// fac 값 정수로 입력 받기.
		System.out.print("팩토리얼을 입력하세요 : ");
		int fac = stdIn.nextInt();
		// facsum 값 1로 초기값 설정.
		int facsum = 1;
		//조건식 fac 1보가 클때 까지 반복
	while (fac > 1 ) {
		// facsum 을 입력받은 fac값과 facsum 값을 곱해서 업데이트
		facsum = fac * facsum;
		System.out.print(fac + "*");
		// fac값 1씩 감소
		fac --;
	}
	// while문 탈출 할때 facsum 값은 입력 받은 값을 2까지 곱한값 1은 곱해도 같음
	System.out.println("1=" + facsum);
	}

}
