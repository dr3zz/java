import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class _12CardsFrequencies {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String[] cards = input.nextLine().split("[ \u2663\u2660\u2665\u2666]+");
		int cardNumber = cards.length;
		Map<String, Integer> cardsMap = new LinkedHashMap<String, Integer>();
		for (String card : cards) {
			Integer count = cardsMap.get(card);
			if (count == null) {
				count = 0;
			}
			cardsMap.put(card, count + 1);
		}
		for (Map.Entry<String, Integer> key : cardsMap.entrySet()) {
			System.out.println(""
					+ key.getKey()
					+ " -> "
					+ (String.format(Locale.US, "%.2f", (double) key.getValue()
							* 100 / cardNumber)) + "%");

		}

	}

}
