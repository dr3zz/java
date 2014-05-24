import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class _10ExtractAllUniqueWords {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String[] strArray = str.split("[ ._:;!?,]+");
		Set<String> strSet = new HashSet<>();
		for (String string : strArray) {
			strSet.add(string.toLowerCase());
		}
		
		for (String string : strSet) {
		System.out.print(string + " ");	
		}
	}

}
