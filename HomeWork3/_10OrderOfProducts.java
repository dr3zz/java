import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;

public class _10OrderOfProducts {

	public static void main(String[] args) {
		ArrayList<Product> listOfProducts = new ArrayList<>();
		Product products = new Product();
		BigDecimal output = new BigDecimal("0");
		String fileName = "e:/temp/Product.txt";
		products.setReadFile(fileName);
		listOfProducts = products.getFruits();
		String readFile = "e:/temp/Order.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(readFile));) {

			while (true) {
				String line = br.readLine();
				if (line == null) {
					break;
				}
				String[] str = line.split(" ");
				for (Product prod : listOfProducts) {

					if (str[1].equals(prod.getProductName())) {

						double tempDouble = prod.getProductPrice();
						String tempStr = String.valueOf(tempDouble);
						BigDecimal temp = new BigDecimal(tempStr);
						String strDouble = str[0];
						BigDecimal strDecimal = new BigDecimal(strDouble);
						temp = temp.multiply(strDecimal);
						output = output.add(temp);

					}

				}

			}
		} catch (Exception e) {
			System.out.println("Error. File does not exist");

		}

		try {

			File file = new File("e:/temp/Output.txt");

			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);

			bw.write(String.valueOf(output));
			bw.close();

			System.out.println("Done");

		} catch (IOException e) {
			e.printStackTrace();
		}
		// System.out.println(output);

	}
}
