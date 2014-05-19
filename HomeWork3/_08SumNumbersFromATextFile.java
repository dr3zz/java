import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class _08SumNumbersFromATextFile {

	public static void main(String[] args) throws IOException {

		int sum = 0;
		try (BufferedReader br = new BufferedReader(new FileReader(
				"e:/temp/file.txt"));) {

			while (true) {
				String line = br.readLine();
				boolean check = false;
				
				if (line == null) {
					break;
				}
				try {
					
					Integer.parseInt(line);
					check = true;
					
				} catch (Exception e) {
					check = false;
				}
				if (check == true) {
					sum = sum + Integer.parseInt(line);
				}
				
			}
			System.out.println(sum);

		} catch (FileNotFoundException e) {
			System.err.println("Error");
		}
	}

}
