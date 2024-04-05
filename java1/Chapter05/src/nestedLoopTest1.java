/*
 * 작성일 : 2024년 4월 5일
 * 작성자 : 컴퓨터 소프트웨어 공학과 202095006학번 고영범
 * 설명 : 전체 구구단 작성하기
 * 
 * 문제분석 :	단은 2~9까지
 * 			곱하는 수는 1~9까지
 * 			2단 출력하고, 3단 출력하고 .. 9단 출력한다. 
 * 알고리즘 :		
 * 			1.단은 2부터 9까지 1씩 증가한다.(초기값,조건식,증감식)
 * 				1-1.단 반복문 안에서 곱하는 수가 1부터 9까지 1씩 증가한다.(초기값,조건식,증감식)
 * 				1-2. 구구단을 출력한다.
 */
public class nestedLoopTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int dan=2;dan<=9;dan++) {
			System.out.println(dan+"단 ");
			for(int su=1;su<=9;su++) {
				System.out.println(dan + "X" +su + " = " + dan*su);
			}
			/*int su=1;
			 * while(su<=9){
			 *  System.out.println(dan + "X" +su + " = " + dan*su);
			 *  su ++
			 *
			 * do{
			 * 	System.out.println(dan + "X" +su + " = " + dan*su);
			 * su++;
			 * }while(su<=9);
			*/
			
			
		}
	}

}
