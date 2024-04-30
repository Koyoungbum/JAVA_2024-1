/*
 * 작성일 : 2024년 4월 22일
 * 작성자 : 컴퓨터 소프트웨어 공학과 202095006학번 고영범
 * 설명 : 1부터 9까지 9개의 값을 랜덤으로 배열에 저장하고, 각 번지에 있는 숫자만큼 ★ 을 출력하시오.
 */
import java.util.Arrays;
import java.util.Random;

public class ArrayTest06 {

	public static void main(String[] args) {
		Random random = new Random();
		int num[] = new int[9];
		
		for(int i=0; i<num.length; i++)  // i는 번지
		{
			int temp = (int)(Math.random() * 9 + 1); //1.0에서 10.0미만의 난수를 temp에 저장
			num[i] = temp;
		}
		
		System.out.print("랜덤으로 생성한 num 값 : ");
		System.out.println(Arrays.toString(num));
		
		for(int i = 0; i < num.length; i++) //i=0 부터 8까지
		{
			System.out.print(num[i] + " : "); 
			for(int j = 0; j <num[i]; j++) //j=0 부터 temp 난수 가찌 별 개수
			{
				System.out.print("★ ");
			}
			System.out.println(""); //j 반복문 한 후에 줄바꿈
}
	}
}

