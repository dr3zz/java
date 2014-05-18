import java.util.Scanner;

public class Problem01SymmetricNumbersInRange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numOne = input.nextInt();
		int numTwo = input.nextInt();
		isSymetric(numOne, numTwo);

	}

	private static void isSymetric(int numOne, int numTwo) {

		while (numOne <= numTwo) {
			String strNum = Integer.toString(numOne);
			for (int i = 0; i < strNum.length(); i++) {
				char[] temp = strNum.toCharArray();
				boolean check = true;
				for (int j = 0 , k = 1; j < temp.length/2; j++,k++) {
					if (check) {
						if (temp[j] != temp[strNum.length() - k]) {
							check = false;
					}
				}
					
				}
				if (check) {
					System.out.print(numOne + " ");
					break;
				}
			}
			numOne++;
		}
	}
}
