import java.util.Arrays;
import java.util.Scanner;


public class _01SortArrayOfNumbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			int num = input.nextInt();
			arr[i] = num;
		}
		Arrays.sort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
