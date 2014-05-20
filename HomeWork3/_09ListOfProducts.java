
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class _09ListOfProducts {

	public static void main(String[] args) {

		ArrayList<Product> listOfProducts = new ArrayList<>();
		Product products = new Product();
		String fileName = "e:/temp/file1.txt";
		products.setReadFile(fileName);
		File newFile = new File(fileName);
		listOfProducts = products.getFruits();
		listOfProducts.sort(products.Fruit(products.getProductName(),
				products.getProductPrice()));

		if (newFile.exists()) {
			try {
				

				File file = new File("e:/temp/file1_.txt");

				// if file doesnt exists, then create it
				if (!file.exists()) {
					file.createNewFile();
				}

				FileWriter fw = new FileWriter(file.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);
				for (Product productNew : listOfProducts) {
					bw.write(String.format("%.2f", productNew.getProductPrice())
							+ " " + productNew.getProductName());
					bw.newLine();
				}

				bw.close();

				System.out.println("Done");

			} catch (IOException e) {
				e.printStackTrace();
			}
		} 

	}

}
