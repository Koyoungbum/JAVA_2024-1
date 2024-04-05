/*
 * 작성일 : 2024년 4월 5일
 * 작성자 : 컴퓨터 소프트웨어 공학과 202095006학번 고영범
 * 설명 : 1부터 10까지 합을 출력하시오.
 * 
 * 문제분석 :1+2+3+4+5+6~+10
 *  		1부터(초기값)
 *  		10까지(조건식)
 *  		1씩 증가(증감식)
 *  		하면서 합계를 계산한다.
 * 			sum = sum + num 공식
 * 			sum = 0 초기값 지정이 반드시 필요하다.
 * 알고리즘 :
 * 		0. sum = 0 으로 초기값을 지정한다.
 * 		1. 수는 1부터 수는 10까지 1씩 증사하면서 반복(초기값)(조건식)(증감식)
 * 			1-1. 합계를 계산한다.
 * 		2. 합계를 출력한다.
 */

public class DoWhileTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,num=1; //1.초기값
		
		do {
			sum=sum+num; //4.합계 계산
			num++;	//3. 증감식
		}while (num<=10);	//2.조건식
		System.out.println("1~10까지 합은 " + sum + "입니다." );
	}	//4-1. 합계 출력

}
