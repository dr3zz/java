import java.util.Scanner;

public class _07CountSubstringOccurrences {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String[] arrStr = str.split("[.,@ !? \"\' \\-\\_\\+\\|&*^ ]+");
		String strAppers = input.nextLine();
		int count = 0;
		for (int i = 0; i < arrStr.length; i++) {
			arrStr[i] = arrStr[i].toLowerCase();

			if (arrStr[i].contains(strAppers)) {
				count = count + countMatches(arrStr[i], strAppers);
			}

		}
		System.out.println(count);
	}

	public static int countMatches(String string, String subString) {

		int count = 0;
		int index = 0;
		while ((index = string.indexOf(subString, index)) != -1) {
			count++;
			index++;
		}
		return count;
	}

}
