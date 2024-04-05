import java.util.Scanner;

public class ComCoditionTest1 {

	public static void main(String[] args) {
System.out.print("월을 입력하세요: ");
		
		Scanner stdIn = new Scanner (System.in);
		int num1 = stdIn.nextInt();
	if (num1 != 0 && num1 <=12) {
		
		if (num1 >=3 && num1 <=5) {
			System.out.println("봄입니다.");
		}
		
		else if (num1 >=6 && num1 <=8) {
			System.out.println("여름입니다.");
		}
		
		else if (num1 >=9 && num1 <=11) {
			System.out.println("가을입니다.");
		}
		
		else if (num1 == 12 && (num1 >=1 && num1 <= 2 )) {
			System.out.println("겨울입니다.");
		}
	}
	else {
		System.out.println("해당 월은 없습니다.");
	}
		

	}

}
