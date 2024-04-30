/*
 * 작성일 : 2024년 4월 30일
 * 작성자 : 컴퓨터 소프트웨어 공학과 202095006학번 고영범
 * 설명 : 2차원 배열을 생성하고, 랜덤수를 배열의 초기값으로 설정합니다.
 *		 
 * 	
 */
import java.util.Arrays;
import java.util.Random;

public class MultiArrayTest01 {
	public static void main(String[] args) {
		// 2차원 배열 생성.
		// 줄,칸
		int[][] num = new int[4][4];
	
		// 랜덤으로 값 초기화 위해 랜덤 객체 생성.
		Random random = new Random();
		
		// 랜덤으로 2차원 배열에 값 저장.
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				num[i][j]=random.nextInt(10); // 0~9
			}
		}
		
		// 2차원 배열 값 출력
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(num[i][j]+" ");
			}
			System.out.println(""); // 줄바꿈.
	}
		
		System.out.println("");
		// 2차원 배열의 내용을 문자열로 출력
		System.out.println(Arrays.deepToString(num));
		
		// 각 줄의 칸의 값들을 합하여 출력하시오
		/*	0번 줄의 0,1,2,3칸의 합을 계산한다.
		 * 	1번 줄의 0,1,2,3칸의 합을 계산한다.
		 * 	2번 줄의 0,1,2,3칸의 합을 계산한다.
		 * 	3번 줄의 0,1,2,3칸의 합을 계산한다.
		 * 	줄을 기준으로 각 칸의 합을 계산하고, 각 줄에 합을 출력한다.
		 * 	한 줄의 합이 계산되어 출력되면 다음 줄의 합을 계산하기 위해
		 * 	sum = 0 으로 다시 초기화  한다.
		 * 
		 */
		int sum=0;
		for(int i=0;i<num.length;i++) { // 배열의 줄 길이 까지
			for(int j=0;j<num[j].length;j++) { // 배열의 줄의 칸 길이 까지
				sum+=num[i][j];
			}
			System.out.println("합 :" + sum +" ");
			sum=0; // 다시 초기화
		}
		
}}










