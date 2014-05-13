import java.util.Locale;
import java.util.Scanner;


public class Problem05DecimaltoHexadecimal {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		int n = input.nextInt();
		String x = Integer.toHexString(n);
		System.out.println(x.toUpperCase());

	}

}
