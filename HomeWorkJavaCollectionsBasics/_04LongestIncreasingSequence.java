import java.util.Scanner;

public class _04LongestIncreasingSequence {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String[] arrayStr = input.split(" ");
		int[] arrayInt = new int[arrayStr.length];
		for (int i = 0; i < arrayInt.length; i++) {
			arrayInt[i] = Integer.parseInt(arrayStr[i]);
		}
		int count = 0;
		int max = 0;
		int position = 0;

		for (int i = 1; i < arrayInt.length + 1; i++) {
			if (i == 1) {
				max = 1;

			}
			count = 1;
			System.out.print(arrayInt[i - 1]);
			while (i < arrayInt.length) {
				if (arrayInt[i - 1] < arrayInt[i]) {
					count++;
					i++;
					if (count > max) {
						max = count;
						position = i;
					}
				} else {
					break;
				}
			}
			System.out.println();

		}

		int[] arrResult = new int[max];
		System.out.print("Longest: ");
		for (int i = 0; i < max; i++) {
			if (position == 0) {
				position = 1;
			}
			arrResult[i] = arrayInt[position - max + i];
		}
		for (int i = 0; i < arrResult.length; i++) {
			System.out.print(arrResult[i] + " ");
		}
		//
	}
}
