import java.util.Scanner;


public class _06CountSpecifiedWord {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String[] arryStr = str.split("[.,@ !? \"\' \\-\\_\\+\\|&*^ ]+");
		String word = input.nextLine();
		int count = 0;
		for (int i = 0; i < arryStr.length; i++) {
			arryStr[i] = arryStr[i].toLowerCase();
			if (arryStr[i].equals(word)) {
				count++;
			}
			
		}
		System.out.println(count);
		

	}

}
