import java.util.Scanner;

public class _02SequencesOfEqualStrings {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String[] arrayStr = str.split(" ");
		for (int i = 1; i < arrayStr.length + 1; i++) {
			 System.out.print(arrayStr[i-1]);
			while (i < arrayStr.length) {
				if (arrayStr[i].equals(arrayStr[i-1])) {
					System.out.print(" " + arrayStr[i-1]);
					i++;
				}
				else {
					break;
				};
			}
			System.out.println();
		}
	}
}
