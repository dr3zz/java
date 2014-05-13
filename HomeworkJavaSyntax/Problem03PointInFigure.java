import java.util.Locale;
import java.util.Scanner;

public class Problem03PointInFigure {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		double x = input.nextDouble();
		double y = input.nextDouble();
		if (y < 6 || y > 13.5) {
			System.out.println("Outside");
		} else {
			if (x < 12.5 || x > 22.5)
				System.out.println("Outside");
			else {
				if (x > 17.5 && x < 20 && y > 8.5)
					System.out.println("Outside");
				else
					System.out.println("Inside");
			}
		}
	}

}
