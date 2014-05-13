import java.lang.Character.UnicodeScript;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Problem04heSmallestof3Numbers {

	public static void main(String[] args) {
		DecimalFormat format = new DecimalFormat();
		format.setDecimalSeparatorAlwaysShown(false);
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		double firstNum = input.nextDouble();
		double secondNum = input.nextDouble();
		double thirdNum = input.nextDouble();
		double result = 0;
		if (firstNum <= secondNum) {
			if (firstNum < thirdNum) {
				result = firstNum;
			} else {
				result = thirdNum;
			}
		} else if (secondNum <= thirdNum) {
			if (secondNum < firstNum) {
				result = secondNum;
			} else {
				result = firstNum;
			}
		}
		System.out.println(format.format(result));

	}

}
