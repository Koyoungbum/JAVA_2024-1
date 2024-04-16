/*
 * 작성일 : 2024년 4월 16일
 * 작성자 : 컴퓨터 소프트웨어 공학과 202095006학번 고영범
 * 설명 : 1차원 배열을 생성하고, 묵시적 초기값을 출력한다.
 * 		 사용자로부터 값을 입력받아 배열에 저장하고, 합과 평균을 출력하시오.
 */
import java.util.Scanner;

public class ArrayTest01 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int i, sum = 0;
		double avg;
		int num[] = new int[5]; // 배열 선언 및 생성.
		
		System.out.println("배열의 길이 : " + num.length);
		
		System.out.println("배열에 저장된 초기값 : ");
		
		for (i =0; i<5; i++) {// 0번지 부터 4번지 까지 i 값 1씩추가
			System.out.println("num[" + i + "] = " + num[i]); // 0번지 부터 4번지 까지 출력
		}
		// 사용자로부터 값을 입력 받아 배열에 저장.
		System.out.println("사용자로부터 값을 입력 받아 배열에 저장");
		for(i=0; i<num.length; i++) {
			System.out.print("num[" + i +"] 번지에 데이터 입력: ");
			num[i]= stdIn.nextInt();
			sum = sum + num[i];
		}
		avg = (double)sum / num.length; // sum / 5 sum은 정수형 avg는 실수형 이므로 둘중 한개 변환
		
		for (i =0; i<5; i++) {// 0번지 부터 4번지 까지 i 값 1씩추가
			System.out.println("num[" + i + "] = " + num[i]); // 0번지 부터 4번지 까지 출력
		}
		// 배열에 저장된 값들의 합과 총점 계산하여 출력
		System.out.println("합계 : " + sum + " 평균 : " +avg);
}
	}

