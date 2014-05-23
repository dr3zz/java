import java.util.Arrays;
import java.util.Scanner;

public class SandGlass {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int inside = n / 2;
		int outside = 0;
		for (int i = 0; i < n / 2 + 1; i++) {

			char[] arrInside = new char[inside];
			Arrays.fill(arrInside, '*');
			char[] arrOutside = new char[outside];
			Arrays.fill(arrOutside, '.');
			String temp = new String(arrOutside) + new String(arrInside) + "*"
					+ new String(arrInside) + new String(arrOutside);
			System.out.println(temp);
			inside--;
			outside++;
		}
		inside++;
		outside--;
		for (int i = 0; i < n / 2; i++) {
			inside++;
			outside--;
			char[] arrInside = new char[inside];
			Arrays.fill(arrInside, '*');
			char[] arrOutside = new char[outside];
			Arrays.fill(arrOutside, '.');
			String temp = new String(arrOutside) + new String(arrInside) + "*"
					+ new String(arrInside) + new String(arrOutside);
			System.out.println(temp);
		}
	}
}