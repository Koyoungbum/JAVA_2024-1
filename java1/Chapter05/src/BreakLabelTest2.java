
public class BreakLabelTest2 {

	public static void main(String[] args) {
		int i=2,j;
		Loop : while(true)
		{
			j=1; // i =2 , j= 1 초기
			if (i < 10) {
				System.out.println("\n=== " + i + "단 ===");
			}
			Innerloop : while(true)
			{
				if ( j > 9) {
					break;
				}
				if ( i > 9) {
					break Loop;
				}
				System.out.println(i+ " * " + j + " = " + i*j);
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
