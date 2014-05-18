import java.util.ArrayList;

public class Problem03FullHouse {

	public static void main(String[] args) {

		ArrayList<String> strList = new ArrayList<String>();
		getCardDeck(strList);
		String fullHouse = null;
		ArrayList<String> fullhouseList = printFullHouse(fullHouse, strList);
		int count = 0;

		for (String string : fullhouseList) {
			count++;
			// System.out.print(string + " ");
		}
		System.out.println(count + " full houses");
	}

	private static ArrayList<String> printFullHouse(String fullHouse,
			ArrayList<String> strList) {
		ArrayList<String> fullhouseList = new ArrayList<String>();
		for (int card1 = 0; card1 < strList.size(); card1++) {
			for (int card2 = card1 + 1; card2 < strList.size(); card2++) {
				for (int card3 = card2 + 1; card3 < strList.size(); card3++) {
					for (int card4 = 0; card4 < strList.size(); card4++) {
						for (int card5 = card4 + 1; card5 < strList.size(); card5++) {
							boolean checkThreeCard = strList.get(card1).charAt(
									0) == strList.get(card2).charAt(0)
									&& strList.get(card2).charAt(0) == strList
											.get(card3).charAt(0);
							boolean checkTwoCards = strList.get(card4)
									.charAt(0) != strList.get(card1).charAt(0)
									&& strList.get(card4).charAt(0) == strList
											.get(card5).charAt(0);

							if (checkThreeCard && checkTwoCards) {
								String temp = strList.get(card1)
										+ strList.get(card2)
										+ strList.get(card3)
										+ strList.get(card4)
										+ strList.get(card5);
								fullhouseList.add(temp);
							}

						}
					}
				}
			}
		}
		return fullhouseList;
	}

	private static void getCardDeck(ArrayList<String> strList) {
		for (int num = 0; num < 4; num++) {
			int cardNum = 0;
			String color = null;
			if (num == 0) {
				color = "\u2663";
			} else if (num == 1) {
				color = "\u2666";
			} else if (num == 2) {
				color = "\u2665";
			} else if (num == 3) {
				color = "\u2660";
			}
			for (int i = 2; i <= 14; i++) {
				cardNum = i;
				String cardNumstr = String.valueOf(cardNum);
				switch (cardNumstr) {
				case "11":
					cardNumstr = "J";
					break;
				case "12":
					cardNumstr = "Q";
					break;
				case "13":
					cardNumstr = "K";
					break;
				case "14":
					cardNumstr = "A";
					break;

				default:
					break;
				}
				strList.add(cardNumstr + color);
			}
		}
	}
}
