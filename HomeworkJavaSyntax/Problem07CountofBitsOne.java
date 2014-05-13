import java.util.Scanner;

public class Problem07CountofBitsOne {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int count = 0;
		String strN = Integer.toBinaryString(n);
		for (int i = 0; i < strN.length(); i++) {
			char currnetCh = strN.charAt(i);
			if (currnetCh == '1') {
				count++;
			}
		}
		System.out.println(count);
	}
}
