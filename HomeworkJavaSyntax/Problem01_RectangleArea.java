import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;


public class Problem01_RectangleArea {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		System.out.println(rectangleArea(a,b));

	}

	private static int rectangleArea(int a, int b) {
		int result = 0;
		result = a * b;
		
		return result;
	}

}
