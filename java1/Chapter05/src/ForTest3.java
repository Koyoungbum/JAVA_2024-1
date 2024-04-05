/*
 * 작성일 : 2024년 4월 5일
 * 작성자 : 컴퓨터 소프트웨어 공학과 202095006학번 고영범
 * 설명 : 정수를 입력 받아 그 수의 약수를 출력하시오.
 * 
 * 문제분석 :
 * 약수는 ... 
 * 		약수는 1부터 자기자신 까지 나누었을때 나머지가 0이 되는 수이다.
 * 		예) 23의 약수는 1,23
 * 		입력 받은 수를 1부터 입력받은 수까지
 * 		나누었을때 나머지가 0이 되는지 판단한다.
 * 		
 * 
 * 알고리즘 : 
 * 		1. 수를 입력 받는다.(정수)
 * 		2. 초기값 num=1 조건식 i 까지 1씩 증가
 * 			2-1. i를 num으로 나눈 나머지가 0
 * 			2-2. num값들 출력
 */

import java.util.Scanner;

public class ForTest3 {

	public static void main(String[] args) {
	
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		//1. 수를 입력 받는다.(정수)
		int i = stdIn.nextInt();
		int num=1; //초기값 num=1
		for (num=1;num<=i;num++) { 
		//2. 조건식 i 까지 1씩 증가
			
			if(i%num==0) {
			//2-1. i를 num으로 나눈 나머지가 0
			System.out.println("입력하신 정수의 약수는 : "+ num);			}
			//2-2. num값들 출력
		}
		
		while (num<=i) {
			if(i%num==0) {
				System.out.println("입력하신 정수의 약수는 : "+ num);
			}
		num++;
		}
		
	}

}
