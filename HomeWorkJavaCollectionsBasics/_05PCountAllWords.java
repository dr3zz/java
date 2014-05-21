import java.util.Scanner;

public class _05PCountAllWords {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String[] arrString = str.split("[\\[\\].,! ()\\-\"\\+ ]+");
		int count = 0;
		for (String string : arrString) {
			count++;
		}
		System.out.println(count);
	}

}
