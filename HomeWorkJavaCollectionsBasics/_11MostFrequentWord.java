import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class _11MostFrequentWord {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String[] strArrStrings = str.toLowerCase().split(
				"[\\[\\].,!? ()\\-\"\\+ ]+");
		int max = 0;
		TreeMap<String, Integer> stringMap = new TreeMap<>();
		for (int i = 0; i < strArrStrings.length; i++) {

			Integer count = stringMap.get(strArrStrings[i]);
			if (count == null) {
				count = 0;
			}
			if (count + 1 > max) {
				max = count + 1;
				
			}
			stringMap.put(strArrStrings[i], count + 1);

		}
		for (Map.Entry<String,Integer> key : stringMap.entrySet()) {
			if (key.getValue() == max) {
				System.out.println(key.getKey() + " -> " + key.getValue() + " times");
			}
		}
		int count = 0;
		for (Map.Entry<String,Integer> key : stringMap.entrySet()) {
			count++;
		}
		System.out.println(count);

	}
}