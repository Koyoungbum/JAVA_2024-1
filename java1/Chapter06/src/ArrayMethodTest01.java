/*
 * 작성일 : 2024년 4월 19일
 * 작성자 : 컴퓨터 소프트웨어 공학과 202095006학번 고영범
 * 설명 : Arrays 클래스와 System 클래스에서 제공하는 메소드 연습
 */

import java.util.Arrays;

public class ArrayMethodTest01 {
	public static void main(String[] args) {
		int num1[] = {9, 1, 7, 3, 5, 4, 6, 2, 9, 0};
		
		System.out.println("초기 배열 :" + Arrays.toString(num1));
		
		// 3번지 부터 4번지까지 요소를 33으로 채운다. 3,5 에서 5앞까지 범위
		Arrays.fill(num1, 3, 5, 33);
		System.out.println("Fill() 메소드 수행 후 :" + Arrays.toString(num1));
		
		// 정렬 : 오름차순
		Arrays.sort(num1);
		System.out.println("sort() 메소드 수행 후 :" + Arrays.toString(num1));
		
		// 처음 33이 몇번째 위치에 있는지 검색
		// 이 메소드를 사용하려면 배열이 정렬되어 있어야 한다.
		System.out.println("33은 배열의 " + Arrays.binarySearch(num1, 33) + "번째 요소");
		
		int num2[] = {5, 4, 3, 2, 1};
		
		System.out.println("num2[] 배열 : " + Arrays.toString(num2));
		
		// 두 배열을 비교하여 결과 반환
		System.out.println("두 배열은 같은가? " + Arrays.equals(num1,num2));
		
		int[] num3 = new int[5]; // 배열 생성.
		
		// 배열에 값 복사하는 메소드
		// num2배열의 0번지 부터 num3의 0번지 위치로 3개 복사된다.
		// 남은 공간은 0으로 저장된다.
		System.arraycopy(num2, 0, num3, 0, 3);
		System.out.println("복사된 배열 num3 : " + Arrays.toString(num3));
	}

}
