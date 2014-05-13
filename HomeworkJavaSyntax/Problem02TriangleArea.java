import java.util.Scanner;

public class Problem02TriangleArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x1 = input.nextInt();
		int y1 = input.nextInt();
		int x2 = input.nextInt();
		int y2 = input.nextInt();
		int x3 = input.nextInt();
		int y3 = input.nextInt();
		int output = 0;
		double a = (double) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1)
				* (y2 - y1));
		double b = (double) Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2)
				* (y3 - y2));
		double c = (double) Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3)
				* (y1 - y3));
		if (a + b > c && a + c > b && b + c > a) {
			double p = (a + b + c) / 2;
			double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
			output = (int) Math.round(result);
		}
	}
}
