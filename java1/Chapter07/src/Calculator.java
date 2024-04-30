/*
 * 작성일 : 2024년 4월 30일
 * 작성자 : 컴퓨터 소프트웨어 공학과 202095006학번 고영범
 * 설명 : 메인 베소드가 있는 클래스.
 * 		 클래스로부터 객체 생성하여 계산 결과 출력한다.
 */
public class Calculator {
	public static void main(String[] args) {
		// PlusMinus 클래스로부터 객체 생성.
		PlusMinus pm = new PlusMinus(); // + -
		// MultiDiv 클래스로 부터 객체 생성. 
		MultiDiv md = new MultiDiv(); // + - * /
		
		
		// 변수 선언.
		String sum, cha, multi, div;
		
		// pm객체를 통해 PlusMinus 클래스에 있는 메소드 호출
		
		sum = pm.plus(10, 20);
		System.out.println(sum);
		
		// 객체를 통해서 minus 메소드 호출하여 결과 
		 cha = pm.minus(10, 20);
		 System.out.println(cha);
		 
		 // md 객체를 통해서 MultiDiv 클래스에 있는 메소드 호출
		 multi = md.multi(10,20);
		 System.out.println(multi);
		 
		 // md 객체를 통해서 더하기 결과 출력
		 // 상속받아 사용하기에 plus 메소드 접근 가능.
		 // 메세지가 요구하는 메소드가 자신의 클래스에 없으면 상위 클래스에 메소드를 찾는다.
		 sum = md.plus(10, 20);
		 System.out.println(sum);
		 
		 // md 객체를 통해서 div 메소드 호출
		 // div 메소드가 private로 선언되어 접근금지.
		 
		 
//		 div = md.div(5, 2); // 오류 발생.
//		 System.out.println(div);
	}		

}
