
public class BreakTest2 {

	public static void main(String[] args) {
		int i, j;
		
		for(i=1;i<10;i++) { // i가 1부터 9까지 1개씩 증가
			
			for(j=1;j<i;j++) { // *가 1부터 i까지 1개씩 증가 첫번째는 i와 j가 같으므로 for문 실행 x
				
				if(j>6) { // *개수가 7개면 탈출
					break;
				}
				
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
