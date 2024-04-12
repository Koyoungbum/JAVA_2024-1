/*
 * 작성일 : 2024년 4월 12일
 * 작성자 : 컴퓨터 소프트웨어 공학과 202095006학번 고영범
 * 설명 : 점수를 입력 받아 합계와 평균을 출력하시오.
 * 		 음수가 입력되면 점수 입력이 종료됩니다.
 * 		 100점 이상의 점수는 계산에 포함되지 않습니다.
 * 
 * 문제 분석
 * 		1. 점수를 계속 입력 받는다.
 * 		2. Continue 문을 사용해서 음수가 입력되면 입력을 종료시킨다.
 * 		3. 100점 초과의 점수가 안됨으로 조건식은 100점 이하로 지정한다.
 * 		4. 합계와 평균을 출력한다.
 * 
 * 알고 리즘
 * 		1. 점수를 정수값으로 입력 받는다.
 * 		2. 몇개의 점수만 입력 하는 것 아님.
 * 		3. 무한 반복하면서 점수 입력 받음
 * 		4. 100점 이상 점수가 입력 되면 다시 입력 받는다
 * 		4-1. 음수 값이면 입력 종료
 * 		5. 0~100 => 합계 계산 => 평균 계산
 * 		6. 합계 평균 출력
 */

import java.util.Scanner;

public class ContinueBreak1 {

	public static void main(String[] args) {
		
		int count = 0;
		int sum = 0;
		double avg = 0;
		
	while (true) { // 무한 반복
		Scanner stdIn = new Scanner(System.in);
		System.out.print(count+1+"번 학생 점수 입력: ");
		
		int jumsu = stdIn.nextInt();
		
		if(jumsu <0) {
			System.out.println("프로그램 종료 ");
			break;
			} // 점수가 0미만이면 반복문 돌아가기
		
		else if (jumsu>100) {
			System.out.println("점수 다시 입력해주세요 ");
			continue;
			} // 100 초과면 반복문 돌아가기
		
		else if (jumsu >= 0 && jumsu <= 100) { // 점수가 0이상 100이하면
			sum = sum + jumsu; // 총합에 점수를 더한다. 
			count ++; // 카운트 1씩 증가
		}
		avg = sum / count; // 반복문 탈출후 평균 구하기
	}
	System.out.print("합계: " + sum + " 평균 : " + avg); // 총합 평균 출력
	}}
