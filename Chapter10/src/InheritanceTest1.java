/*
 * 작성일 : 05/21
 * 작성자 : 202095006 고영범
 * 설명 : 상속과 한정자
 */
class A{
	public int aa = 1; // 멤버변수이면서 모두 접근 가능
}
//A 클래스 상속 받음.
class B extends A{ 
	private int bb = 2; // 멤버변수이지만 같은 클래스 내에서만 사용가능
	public int bb() {// 메소드. 모드 접근 가능
		return bb; //이 메소드를 이용하여 외부에서는 접근이 불가능한 bb를 사용할 수 있다.
		//이 클래스에는 aa, bb ,bb() 가 있다.
	}
}

class C extends B{
	// 이 클래스에는 aa, bb, bb()가 있다.
	int cc = 3;  //default 같은 패키지 내에서만 접근 가능 (상속 여부 x)
}

public class InheritanceTest1 {
	public static void main(String[] args) {
		C objc = new C();
		System.out.println("cc의 값은? "+objc.cc);
		System.out.println("cc의 값은? "+objc.bb());
	}

}
