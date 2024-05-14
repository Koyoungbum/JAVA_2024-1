class Box9{
	private int width;
	private int height;
	private int depth;
	private int vol;

public Box9(int width, int height, int depth) {
	this.width = width;
	this.height = height;
	this.depth = depth;
	
	volume();
}

private void volume() {
	// vol은 private로 선언된 객체 변수이지만 내부에서 사용가능
	vol = width*height*depth;
}

public int getvolume() {
	return vol;
}
}
public class Box9Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box9 mybox1 = new Box9(10,20,30);
		// private로 선언되어 객체 변수 변경 불가능.
		// mybox1.width = 20;
		
		// private로 선언된 메소드는 객체로 바로 접근 불가능.
		int vol1 = mybox1.getvolume();
		System.out.println(vol1);
	}

}
