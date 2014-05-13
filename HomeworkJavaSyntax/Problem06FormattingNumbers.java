import java.util.Locale;
import java.util.Scanner;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Problem06FormattingNumbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		int a = input.nextInt();
		double b = input.nextDouble();
		double c = input.nextDouble();

		String aHex = Integer.toHexString(a).toUpperCase();
		String aBin = String.format("%10s", Integer.toBinaryString(a)).replace(
				' ', '0');
		System.out.printf("|%-10s|%s|%10.2f|%-10.3f| ", aHex, aBin, b, c);
	}

}
