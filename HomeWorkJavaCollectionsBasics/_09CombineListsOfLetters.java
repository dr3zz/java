import java.util.ArrayList;
import java.util.Scanner;

public class _09CombineListsOfLetters {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String strFirstLine = input.nextLine();
		String strSecoundLine = input.nextLine();
		ArrayList<Character> arrayList = new ArrayList<>();
		for (int i = 0; i < strFirstLine.length(); i++) {
			char temp = strFirstLine.charAt(i);
			if (temp != ' ') {
				arrayList.add(temp);
			}
		}
		ArrayList<Character> newArrayList = addNotRepeatedLettersInList(
				strSecoundLine, arrayList);
		arrayList.addAll(newArrayList);
		printList(arrayList);
	}

	private static void printList(ArrayList<Character> arrayList) {
		for (Character character : arrayList) {
			System.out.print(character + " ");
		}
	}

	private static ArrayList<Character> addNotRepeatedLettersInList(String str,
			ArrayList<Character> arrayList) {
		ArrayList<Character> arrList = new ArrayList<>();
		for (int i = 0; i < str.length(); i++) {
			char strCh = str.charAt(i);
			if (strCh != ' ') {
				int count = 0;
				for (int j = 0; j < arrayList.size(); j++) {
					if (arrayList.get(j) == strCh) {
						count++;
						break;
					}
				}
				if (count == 0) {
					arrList.add(strCh);
				}
			}
		}
		return arrList;
	}
}
