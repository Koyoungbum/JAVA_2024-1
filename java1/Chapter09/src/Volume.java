/*
 * 작성일 : 2024년 5월 10일
 * 작성자 : 컴퓨터 소프트웨어 공학과 202095006학번 고영범
 * 설명 : 
 */
import java.util.Scanner;

class Box{ // 박스 부피 계산하는 클래스
	int width,height,depth; //멤버 변수 - 객체 변수 /클래스 전역에서 사용가능
	
	// 생성자. 매개변수가 3개인 생성자.
	// 3개의 값을 전달 받아 각 변수에 저장한다.
	// 생성자 오버로딩 - 같은 이름의 생성자가 여러 개 있다.
	public Box(int w,int h,int d) {
		
		width = w; //매개변수 값을 객체 변수에 저장
		height = h;
		depth = d;
	}
	// 매개 변수가 없는 생성자 - 묵시적 생성자.
	public Box() {
		width = 10;
		height = 20;
		depth = 30;
	}
}


public class Volume {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("너비 길이 입력 : ");
		int w = stdIn.nextInt();
		System.out.print("높이 길이 입력 : ");
		int d = stdIn.nextInt();
		System.out.print("깊이 길이 입력 : ");
		int h = stdIn.nextInt();
		
		//매개 변수가 3개인 생성자 호출.
		//생성자가 있는 클래스로부터 객체를 생성하는 경우,
		//반드시 생성자의 매개변수 형과 개수가 일치해야한다.
		Box mybox1 = new Box(w, h, d);
		int vo1 = mybox1.width*mybox1.height*mybox1.depth;
		
		//매개 변수가 없는 생성자 호출.
		Box mybox2 = new Box();
		int vo2 = mybox2.width*mybox2.height*mybox2.depth;
		System.out.println("입력 받은 값의 부피는 : "+ vo1);
		System.out.println("정해진 값의 부피는 : "+ vo2);
	}
}
