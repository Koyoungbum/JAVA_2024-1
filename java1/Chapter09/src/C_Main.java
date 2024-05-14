
public class C_Main {
	int count = 10; // 객체 변수
	static int num = 20; // 클래스 변수
	
	public int sum(int x, int y) {
		return x + y;
	}
	
	// 클래스 메소드 선언
	static int mul(int x, int y) {
		return x * y; 
	}
	// 메인 메소드 - 클래스 메소드.
	public static void main(String[] args) {
		int same;
		
		// 반드시 클래스 변수, 지역 변수만 사용 가능하다.
		//same = count; count 는 객체 변수여서 오류 발생
		
		same = num;
		System.out.println("num = "+same);
		
		// 클래스 메소드가 아니어서 오류 발생한다.
		// 호출 불가능.
		//same = sum(5, 5);
		
		same = mul(5, 5);
		System.out.println("mul = "+ same);
	}
}
