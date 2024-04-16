/*
 * 작성일 : 2024년 4월 16일
 * 작성자 : 컴퓨터 소프트웨어 공학과 202095006학번 고영범
 * 설명 : 1차원 배열에 정수 값을 저장하여 생성하시오.
 * 		 사용자로부터 정수를 하나 입력받아 그 정수가 어디에 몇개 있는지 출력하시오.
 * 		 입력한 값이 배열에 없다면 "입력한 값이 없습니다."를 출력하시오.
 * 
 * 문제 분석 
 * 		1. 배열을 한개 만들어서 저장한다.
 * 		2. 사용자로 부터 정수를 한개 입력 받는다.
 * 		3. 반복문
 * 		3-1. i=0,i<num1.length 까지 1개씩 증가시키며 같은 값을 찾는다
 *		3-2. 같은 값을 찾을경우 i를 출력하고 count를 1씩 증가시킨다. (num == (int)num1[i]) count++
 *		4. 다를경우 count가 0이면 (count == 0)
 *		4-1.입력한 값이없다.출력
 *		5.count 출력
 */

import java.util.Scanner;

public class ArrayTest03 {

	public static void main(String[] args) {
		int num1[] = {23,26,13,13,23,38,44,21};
		int count = 0;
		
			Scanner stdIn = new Scanner(System.in);
			System.out.print("정수 입력: ");
			int num = stdIn.nextInt();
			
			for(int i=0;i<num1.length;i++) {
				if(num == (int)num1[i]) {
					System.out.println(i+1+"번째에 위치합니다.");
					count++;
				}
			}
			if(count == 0) {
				System.out.println("입력한 값이 없습니다.");
			}
			System.out.println(count+"개 있습니다.");
			
			
	}

}
