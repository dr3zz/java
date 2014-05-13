import java.util.Scanner;


public class Problem08CountOfEqualBitPairs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int count = 0;
		String strN = Integer.toBinaryString(n);
		for (int i = 0; i <strN.length(); i++) {
			char temp = strN.charAt(i);
			if (i>0) {
				if (temp == strN.charAt(i-1)) {
					count++;	
					}
			}
			
		}
		System.out.println(count);

	}
}
