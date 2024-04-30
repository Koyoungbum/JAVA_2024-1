/*
 * 작성일 : 2024년 4월 22일
 * 작성자 : 컴퓨터 소프트웨어 공학과 202095006학번 고영범
 * 설명 : 문자열 배열을 이용하여 Arrays 클래스와 system 클래스에서 제공하는 메소드 사용
 */

import java.util.Arrays;

		public class ArrayMethodTest02 {
			public static void main(String args[]) {
				String[] array1 = {"IMF", "제주도", "자바도사", "한글나라", "Computer", "모카", "JAVA", "인터넷탐색", "초롱초롱", "come", "바람", "스크립터", "군고구마", "도서", "their","country" };   
				
				System.out.println("======= 정렬 전 데이터 ==========");
				// Arrays.toString 메서드는 배열의 내용을 문자열 형태로 반환
				System.out.println(Arrays.toString(array1));
				
				// Arrays.sort() 메소드는 오름차순 정렬한다.
				Arrays.sort(array1);
				System.out.println("======= 정렬 후 데이터 ==========");
				System.out.println(Arrays.toString(array1));
				
				// Arrays.binarySearch()는 배열에서 "군고구마"를 찾아 위치를 반환.
				System.out.println("군고구마는 배열의 " + Arrays.binarySearch(array1,"군고구마") + "번째 요소");
				
				String[] array2 = array1;
				// Arrays.equals() 는 두 배열을 비교하여 결과를 반환.
				System.out.println("array1과 array2가 같은가? : " + Arrays.equals(array1,array2));
				
				String[] array3 = new String[20];
				// arraycopy()는 num2 배열의 0번지부터 num3배열의 0번지 위치로 
		               // array2 길이까지 복사한다. 
				// 빈 공간은 null로 채운다.
				System.arraycopy(array2, 0, array3, 0, array2.length);
				System.out.println("======= array3 배열 ==========");
				System.out.println(Arrays.toString(array3));
			}	
	}
