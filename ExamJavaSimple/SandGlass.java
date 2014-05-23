import java.util.Arrays;
import java.util.Scanner;

public class SandGlass {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

//		char[] arrCh = new char[n];
//		Arrays.fill(arrCh, '*');
//		String result = new String(arrCh);
//		System.out.println(result);
		int inside = n/2;
		int outside = 0;
 		for (int i = 0; i < n /2 + 1 ; i++) {
 			
 			
 			char[] leftSide = new char[inside];
 			Arrays.fill(leftSide, '*');
 			char[] rightSide = new char[outside];
 			Arrays.fill(rightSide, '.');
			String temp = new String(rightSide) + new String(leftSide)
			+"*" + new String(leftSide) + new String(rightSide) ;
			System.out.println(temp);
			inside--;
 			outside++;
		}
 		inside++;
 		outside--;
 		for (int i = 0; i < n/2; i++) {
 			inside++;
 			outside--;
 			char[] leftSide = new char[inside];
 			Arrays.fill(leftSide, '*');
 			char[] rightSide = new char[outside];
 			Arrays.fill(rightSide, '.');
			String temp = new String(rightSide) + new String(leftSide)
			+"*" + new String(leftSide) + new String(rightSide) ;
			System.out.println(temp);
		}
//		System.out.println(result);
	}
}