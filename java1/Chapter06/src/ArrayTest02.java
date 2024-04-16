/*
 * 작성일 : 2024년 4월 16일
 * 작성자 : 컴퓨터 소프트웨어 공학과 202095006학번 고영범
 * 설명 : 배열에 저장된 값 중 최대값과 최소값을 출력하시오.
 * 
 * 최대값, 최소값
 * 반드시 비교 대상이 필요하다.
 * ex) {34, 23, 56, 12, 77}
 * 
 * 첫번째 값을 기준으로 비교한다. => 0번지에 저장된 값을 기준으로 한다.
 * 비교하여 큰 값은 max변수에 저장한다.
 * 작은 값은 min변수에 저장한다.
 * 
 * 비교 대상인 0번지 값을 비교 할 필요가 없다.
 * 반복은 1번지부터 하면된다.
 */

import java.util.Scanner;

public class ArrayTest02 {
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int num[] = new int[5];
		
		for (int i=0; i<num.length; i++) {	//배역 안에 입력받은 값 저장하기
			System.out.print("num[" + i +"] 번지에 데이터 입력: ");
			num[i]= stdIn.nextInt();
		}
		int max = num[0]; //max,min 초기값
		int min = num[0];
		
		for (int i=1; i<num.length;i++) { 
			if(max<num[i]) {
				max = num[i];
				
			}
			else if(min>num[i]) {
				min = num[i];
			}
		}
		System.out.println("Max : " +max+" Min : "+min);
		
		//확장된 for문
		// 비교 기준 설정.
		max = num[0];
		min = num[0];
		
		for(int j :num) { // num배열에 저장된 값을 차례대로 j에 저장하여 실행.
			if(max < j) {
				max = j;
			}
			if (min > j) {
				min = j;
			}
		}
		System.out.println("Max : " +max+" Min : "+min);
	}

}
