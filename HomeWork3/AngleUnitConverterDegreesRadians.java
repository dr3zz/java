import java.text.Format;
import java.util.Scanner;

public class AngleUnitConverterDegreesRadians {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		for (int i = 0; i < num; i++) {
			double temp = input.nextDouble();
			String measure  = input.next();
			if (measure.equals("deg")) {
				System.out.printf("%.6f rad\n",returnRadians(Double.valueOf(temp))
						);
			} else if (measure.equals("rad")) {
				System.out.printf("%.6f deg\n",returnDegrees(Double.valueOf(temp)));
			}

		}

	}

	private static double returnRadians(double test) {
		test = Math.toRadians(test);
		return test;

	}

	private static double returnDegrees(double test) {
		test = Math.toDegrees(test);
		return test;

	}

}
