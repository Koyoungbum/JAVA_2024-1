class Box4{
	int width, height, depth; //객체 변수
	
	// 생성자
	public Box4(){
		// 다른 생성자 호출한다.
		// 반드시 첫번째 라인에 위치해야 한다.
		this(1, 1, 1);
		System.out.println("매개 변수 없는 생성자 수행");
	}
	//정수형 매개변수 3개인 생성자
	public Box4(int width, int height, int depth) {
		System.out.println("매개 변수 3개 생성자 수행");
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
}

public class thisTest04 {

	public static void main(String[] args) {
		Box4 mybox1 = new Box4();
		int vol1 = mybox1.width * mybox1.height * mybox1.depth;
		System.out.println("박스의 부피(매개변수 없음) : " + vol1);
		
		mybox1 = new Box4(10,20,30);
		vol1 = mybox1.width * mybox1.height * mybox1.depth;
		System.out.println("박스의 부피(매개변수 3개) : " + vol1);
	}

}
