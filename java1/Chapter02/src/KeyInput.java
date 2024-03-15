/*
 * 작성일 : 2024년 3월 12일
 * 작성자 : 컴퓨터 소프트웨어 공학과 202095006학번 고영범
 * 설명 : 이름 입력 받아 출력하기.
 */
// 입력을 위한 라이브러리 포함하기.
import java.util.Scanner;

public class KeyInput {

	public static void main(String[] args){
		//키보드로부터 입력 받기 위해 Scanner 객체 생성.
	 	Scanner stdIn = new Scanner(System.in);
	// 자료형    객체 변수명 = 객체 생성한다 

	 System.out.print("당신의 이름을 입력하세요.");
	 
	 // 사용자의 입력을 문자열로 받아 저장한다.
	 String name = stdIn.next();
	 
	 // 출력
	 System.out.println("안녕하세요. " + name + "님 반갑습니다.");
	 	
	}
}