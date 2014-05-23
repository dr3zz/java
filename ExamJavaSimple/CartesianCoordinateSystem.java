import java.util.Scanner;

public class CartesianCoordinateSystem {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		 double x =  Double.parseDouble(input.nextLine());
		 double y = Double.parseDouble(input.nextLine());
		if (x == 0 && y == 0) {
			System.out.println(0);
		}
		if (y == 0 && x != 0) {
			System.out.println(6);
		}
		if (x == 0 && y != 0) {
			System.out.println(5);
		}
		if (x > 0 && y > 0) {
			System.out.println(1);
		} else if (x > 0 && y < 0) {
			System.out.println(4);
		} else if (x < 0 && y < 0) {
			System.out.println(3);
		} else if (x < 0 && y > 0) {
			System.out.println(2);
		}
		
	}

}
