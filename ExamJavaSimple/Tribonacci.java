import java.math.BigDecimal;
import java.util.Scanner;

public class Tribonacci {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int tribFirst = input.nextInt();
		int tribSecond = input.nextInt();
		int tribThird = input.nextInt();
		BigDecimal tribFirstNum = new BigDecimal("" + tribFirst);
		BigDecimal tribSecondNum = new BigDecimal("" + tribSecond);
		BigDecimal tribThirdNum = new BigDecimal("" + tribThird);
		int n = input.nextInt();

		if (n == 1) {
			tribThirdNum = tribFirstNum;
		} else if (n == 2) {
			tribThirdNum = tribSecondNum;
		} else if (n == 3) {
			
		} else {
			for (int i = 4; i <= n; i++) {
				BigDecimal tribonacci = tribFirstNum.add(tribSecondNum
						.add(tribThirdNum));
				tribFirstNum = tribSecondNum;
				tribSecondNum = tribThirdNum;
				tribThirdNum = tribonacci;
			}
			
		}
		System.out.println(tribThirdNum);
	}
}
