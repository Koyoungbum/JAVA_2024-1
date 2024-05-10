class Box2{
	int width, height,depth; //멤버 변수
	
	//생성자.
	//매개변수로 지정된 w, h, d 는 의미를 알기 어렵다.
	public Box2(int width, int height, int depth) {
		//자신의 변수에 자신의 값을 저장한다.
		//생성자 메소드 내의 변수로만 취급된다.
		width = width;
		height = height;
		depth = depth;
	}
}

public class thisTest02 {
	public static void main(String[] args) {
		Box2 mybox = new Box2(10,20,30);
		System.out.println(mybox.width);
		// 묵시적 값인 0이 출력된다. this 사용을 안했을때
	}
}
