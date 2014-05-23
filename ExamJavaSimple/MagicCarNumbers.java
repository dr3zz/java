import java.util.ArrayList;
import java.util.Scanner;

public class MagicCarNumbers {

	public static void main(String[] args) {

		ArrayList<String> outArrayList = generateSofiaCarRegistrationNumber();
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int count = 0;
		for (String string : outArrayList) {
			int sum = 0;
			int tempInt = 0;
			sum = sumRegistrationNumbers(string, sum, tempInt);
			if (sum == n) {
				boolean magicCarRegister = checkSpecialMagicWeight(string);
				if (magicCarRegister) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

	private static ArrayList<String> generateSofiaCarRegistrationNumber() {
		ArrayList<String> numberList = generateRegistrationNumberDigits();
		ArrayList<String> registrationLetterList = generateRegistrationNumberLetters();
		ArrayList<String> outArrayList = new ArrayList<>();
		for (String string : numberList) {
			for (String string1 : registrationLetterList) {
				outArrayList.add("CA" + string + string1);
			}
		}
		return outArrayList;
	}

	private static ArrayList<String> generateRegistrationNumberDigits() {
		String numberOutput;
		ArrayList<String> numberList = new ArrayList<>();
		String[] registrationNumber = { "1", "2", "3", "4", "5", "6", "7", "8",
				"9", "0" };
		for (int i = 0; i < registrationNumber.length; i++) {
			for (int j = 0; j < registrationNumber.length; j++) {
				for (int k = 0; k < registrationNumber.length; k++) {
					for (int n = 0; n < registrationNumber.length; n++) {
						numberOutput = registrationNumber[i]
								+ registrationNumber[j] + registrationNumber[k]
								+ registrationNumber[n];
						numberList.add(numberOutput);
					}
				}
			}
		}
		return numberList;
	}

	private static ArrayList<String> generateRegistrationNumberLetters() {
		String registrationLetterOutput;
		String[] registrationLetter = { "A", "B", "C", "E", "H", "K", "M", "P",
				"T", "X" };
		ArrayList<String> registrationLetterList = new ArrayList<>();
		for (int i = 0; i < registrationLetter.length; i++) {
			for (int j = 0; j < registrationLetter.length; j++) {
				registrationLetterOutput = registrationLetter[i]
						+ registrationLetter[j];
				registrationLetterList.add(registrationLetterOutput);
			}
		}
		return registrationLetterList;
	}

	private static int sumRegistrationNumbers(String string, int sum,
			int tempInt) {
		for (int i = 0; i < string.length(); i++) {
			char temp = string.charAt(i);
			switch (temp) {
			case '1':
				tempInt = 1;
				break;
			case '2':
				tempInt = 2;
				break;
			case '3':
				tempInt = 3;
				break;
			case '4':
				tempInt = 4;
				break;
			case '5':
				tempInt = 5;
				break;
			case '6':
				tempInt = 6;
				break;
			case '7':
				tempInt = 7;
				break;
			case '8':
				tempInt = 8;
				break;
			case '9':
				tempInt = 9;
				break;
			case '0':
				tempInt = 0;
				break;
			case 'A':
				tempInt = 10;
				break;
			case 'B':
				tempInt = 20;
				break;
			case 'C':
				tempInt = 30;
				break;
			case 'E':
				tempInt = 50;
				break;
			case 'H':
				tempInt = 80;
				break;
			case 'K':
				tempInt = 110;
				break;
			case 'M':
				tempInt = 130;
				break;
			case 'P':
				tempInt = 160;
				break;
			case 'T':
				tempInt = 200;
				break;
			case 'X':
				tempInt = 240;
				break;

			default:
				break;
			}
			sum += tempInt;
		}
		return sum;
	}

	private static boolean checkSpecialMagicWeight(String string) {
		boolean magicCarCheck = false;

		char firstDigit = string.charAt(2);
		char secoundDigit = string.charAt(3);
		char thirdDigit = string.charAt(4);
		char fourthDigit = string.charAt(5);
		if (firstDigit == secoundDigit) {
			if (secoundDigit == thirdDigit) {
				if (thirdDigit == fourthDigit
						|| thirdDigit != fourthDigit) {
					magicCarCheck = true;
				}
			}
		}
		if (firstDigit != secoundDigit) {
			if (secoundDigit == thirdDigit) {
				if (thirdDigit == fourthDigit) {
					magicCarCheck = true;
				}
			}
		}
		if (firstDigit == secoundDigit) {
			if (secoundDigit != thirdDigit) {
				if (thirdDigit == fourthDigit) {
					magicCarCheck = true;
				}
			}
		} else {
			if (firstDigit == thirdDigit) {
				if (secoundDigit == fourthDigit) {
					magicCarCheck = true;
				}
			} else if (firstDigit == fourthDigit) {
				if (secoundDigit == thirdDigit) {
					magicCarCheck = true;
				}
			}
		}
		return magicCarCheck;
	}
}
