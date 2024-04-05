/*
 * 작성일 : 2024년 4월 5일
 * 작성자 : 컴퓨터 소프트웨어 공학과 202095006학번 고영범
 * 설명 : 입력받은 정수의 개수에 따라 *을 1부터 정수값 까지 출력
 * 
 * 문제분석 :	단은 2~9
 * 알고리즘 :		
 * 			1.단은 2부터 9까지 1씩 증가한다.(초기값,조건식,증감식)
 * 				1-1.단 반복문 안에서 곱하는 수가 1부터 9까지 1씩 증가한다.(초기값,조건식,증감식)
 * 				1-2. 구구단을 출력한다.
 */

import java.util.Scanner;

public class nestedLoopTest2 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = stdIn.nextInt();
		
		for (int i=1;i<=num;i++) {  //줄의 개수
			for(int j=1;j<=i;j++) { // *의 개수
			System.out.print("*");
			}
			System.out.println("");
		}
	
	}

}
