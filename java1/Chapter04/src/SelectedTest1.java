/*
 * 세 자리의 십진수를 입력받아 각자리의 숫자들이 짝수인지 홀수인지 판단.
 * 
 * [문제분석]
 * 		짝수는 2로 나눈 나머지가 0이다.
 * 		홀수는 2로 나눈 나머지가 1이다.(0이 아니다.)
 * 		세자리 수 : 100~999
 * 		예를들어 123을 입력했다면
 * 		100의 자리 1은 홀수입니다.
 * 		10의 자리 2는 짝수입니다.
 * 		1의 자리 3은 홀수입니다. 출력한다.
 * 
 * 		100의 자리, 10의 자리, 1의 자리를 구분해야 한다.
 * 		힌트) 나누기와 나머지 연산자를 활용한다.
 * 
 * 
 * [알고리즘]
 * 		1.세 자리 정수를 입력받는다.
 * 		2.만약 정수가 3자리이면 (100보다 크고, 1000보다 작다)
 * 			1) 100의 자리를 찾는다
 * 			2) 10의 자리를 찾는다.
 * 			3) 1의 자리를 찾는다.
 * 			4) 만약 100의 자리가 짝수이면
 * 				1. 0은 짝수입니다.
 * 
 */

import java.util.Scanner;

public class SelectedTest1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("세자리 정수를 입력하시오 : ");
		int num1 = stdIn.nextInt();
		
	if (num1 >= 100 && num1 <= 999) {
		
		int num_100 = num1 / 100; // 100의 자리 몫 찾기
		int num_10 = (num1 % 100) / 10; // 10의 자리 몫 찾기
		int num_1 = (num1 % 100) % 10; // 1의 자리 몫 찾기
		
		if (num_100==1) {
			System.out.println("100의 자리숫자는 홀수이다.");
		}
		else {
			System.out.println("100의 자리숫자는 짝수이다.");
		}
		
		if (num_10==1) {
			System.out.println("10의 자리숫자는 홀수이다.");
		}
		else {
			System.out.println("10의 자리숫자는 짝수이다.");
		}
		
		if (num_1==1) {
			System.out.println("1의 자리숫자는 홀수이다.");
		}
		else {
			System.out.println("1의 자리숫자는 짝수이다.");
		}
	}
	

}}
