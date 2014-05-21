import java.util.Scanner;

public class _03LargestSequenceOfEqualStrings {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String[] arrayStr = str.split(" ");
		String temp = null;

		int max = 0;
		for (int i = 1; i < arrayStr.length + 1; i++) {
			int count = 1;
			if (i == 1) {
				 temp = arrayStr[i-1];
				 max = 1;
			}
			while (i < arrayStr.length) {
				if (arrayStr[i].equals(arrayStr[i - 1])) {
					count++;
					i++;
					if (count > max) {
						max = count;
						temp = arrayStr[i - 1];
					}
				} else {
					break;
				}
			}
		}
		for (int i = 0; i < max; i++) {
			System.out.printf("%s ", temp);
		}

	}

}
