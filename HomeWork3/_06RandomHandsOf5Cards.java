import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class _06RandomHandsOf5Cards {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		ArrayList<String> deckCard = deckOfCards();
		for (int i = 0; i < n; i++) {
			int[] temp = getRandomFiveNumber();

			for (int j = 0; j < temp.length; j++) {
				System.out.print(deckCard.get(temp[j]) + " ");

			}
			System.out.println();
		}
	}

	private static int[] getRandomFiveNumber() {
		int[] cardNumber = new int[52];
		for (int j = 0; j < cardNumber.length; j++) {
			cardNumber[j] = j;
		}
		Random temp = new Random();
		int randomIndex;
		int randomValue;
		for (int j = 0; j < cardNumber.length; j++) {
			randomIndex = temp.nextInt(cardNumber.length);
			randomValue = cardNumber[randomIndex];
			cardNumber[randomIndex] = cardNumber[j];
			cardNumber[j] = randomValue;
		}
		int[] result = new int[5];
		for (int i = 0; i < 5; i++) {
			result[i] = cardNumber[i];
		}
		return result;
	}

	
	private static ArrayList<String> deckOfCards() {
		String[] cardNum = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J",
				"Q", "K", "A" };
		String[] cardColor = { "♣", "♦", "♥", "♠" };
		ArrayList<String> deckCard = new ArrayList<>();
		for (String stringNum : cardNum) {
			for (String stringColoor : cardColor) {
				String temp = stringNum + stringColoor;
				deckCard.add(temp);
			}
		}
		return deckCard;

	}

}
