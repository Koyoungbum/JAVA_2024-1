/*
 * 작성일 : 2024년 5월 10일
 * 작성자 : 컴퓨터 소프트웨어 공학과 202095006학번 고영범
 * 설명 : 정수형,실수형 매개변수를 가진 생성자를 만들어서 객체로 호출할때 매개변수의 값에 따라 계산되는 부피를 구하는 문제
 * 
 * 알고리즘 : 1.Box6 클래스에 정수형,실수형 객체변수를 선언한다.
 * 		 	2.같은 생성자(Box6)로 오버로딩 시킨다
 * 		 	3.객체 생성을할때 정수형,실수형(정수,실수)로 넣어실행시킨다.
 * 		 3-1.정수형일때 매개변수가 정수형이된 생성자가 호출된다.
 * 		 3-2.실수형일때는 실수형이된 생성자가 호출된다.
 * 	  	 3-3.정수,실수가 섞여 있을때 확대형인 실수로 변환시켜 호출된다.
 */
class Box6 {
	// 멤버변수 - 객체변수. 클래스 전역에서 사용 가능.
	int width;  
	int height;
	int depth;
	
	double dwidth;
	double dheight;
	double ddepth;
	
	// 생성자 오버로딩. - 정수형 매개변수 3개
	public Box6(int w, int h, int d) {
		width = w;
		height = h;
		depth = d;
	}

	// 생성자 오버로딩. - 실수형 매개변수 3개
	public Box6(double w, double h, double d) {
		dwidth = w;
		dheight = h;
		ddepth = d;
	}
}

// 메인 메소드가 있는 클래스
public class BoxOverloading02 {
	public static void main(String args[]) {
		// 정수형 매개변수가 3개인 생성자 호출.
		Box6 mybox1 = new Box6(10,20,30);
		int vol = mybox1.width * mybox1.height * mybox1.depth;
		System.out.println("박스의 부피(정수 매개 변수) : " + vol);
		
		// 실수형 매개변수가 3개인 생성자 호출.
		mybox1 = new Box6(10.5, 20.5, 30.5);
		double dvol = mybox1.dwidth * mybox1.dheight * mybox1.ddepth;
		System.out.println("박스의 부피(실수 매개 변수) : " + dvol);
		
		// 정수형, 실수형 매개변수가 3개인 생성자 호출. => 없다.
		// 혼합되어 있는 경우 자동으로 확대형(실수)으로 변환되어 수행.
		mybox1 = new Box6(10,20,30.5);
		dvol = mybox1.dwidth * mybox1.dheight * mybox1.ddepth;
		System.out.println("박스의 부피(정수와 실수 혼합) : " + dvol);		
	}
}