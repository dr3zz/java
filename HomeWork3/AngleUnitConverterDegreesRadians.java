import java.text.Format;
import java.util.Scanner;

public class AngleUnitConverterDegreesRadians {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int num = input.nextInt();

		for (int i = 0; i < num; i++) {
			double temp = input.nextDouble();
			String measure = input.next();
			if (measure.equals("deg")) {
				System.out.printf("%.6f rad\n", returnRadians(temp));
			} else if (measure.equals("rad")) {
				System.out.printf("%.6f deg\n", returnDegrees(temp));
			}
		}
	}

	private static double returnRadians(double temp) {
		temp = Math.toRadians(temp);
		return temp;

	}

	private static double returnDegrees(double temp) {
		temp = Math.toDegrees(temp);
		return temp;
	}
}
