/*
 * 작성일 : 05/21
 * 작성자 : 202095006 고영범
 * 설명 : 클래스 변수와 클래스 메소드의 상속
 */
class C1{
	private static int x = 100;
	public static int y = x;
	static int z = x;
	
	public static int cc() {
		return x;
	}
}
class C2 extends C1{
	public static String x;
	static int y;
	// 이 클래스에는 x, y, z, cc()가 있다.
	// x, y는 C2 클래스에 있는 클래스 변수이다.
}
public class InheritanceTest3 {
	public static void main(String[] args) {
		//객체 생성 할까요? 생성 할 필요 없다. 클래스 변수와 클래스 메소드는
		//클래스 이름으로 접근한다.
		System.out.println("C1클래스의 cc() 값 : " + C1.cc());
		System.out.println("C1클래스의 y 값 : " + C1.y);
		System.out.println("C1클래스의 z 값 : " + C1.z);
		System.out.println("");
		
		System.out.println("C2클래스의 x 값 : " + C2.x);
		System.out.println("C2클래스의 y 값 : " + C2.y);
		System.out.println("C2클래스의 z 값 : " + C2.z);
		System.out.println("C2클래스의 cc() 값 : " + C2.cc());
		System.out.println("");
		
		C2.x="오늘은 화요일 입니다.";
		C2.y = 200;
		C2.z = 300;
		
		System.out.println("C2클래스의 x 값 : " + C2.x);
		System.out.println("C1클래스의 y 값 : " + C2.y);
		System.out.println("C2클래스의 z 값 : " + C2.z);
	}

}