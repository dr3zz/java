import java.util.Scanner;

public class Problem02Generate3LetterWords {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.next();
		char[] arr = str.toCharArray();
		printThreeLetters(arr);
		
	}

	private static void printThreeLetters(char[] arr) {
	
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				for (int n = 0; n < arr.length; n++) {
					String tempString = String.valueOf(arr[i]) + 
							String.valueOf(arr[j]) + String.valueOf(arr[n]);
					System.out.print(tempString + " ");
					 
				}
			}
			
		}
	}
}
