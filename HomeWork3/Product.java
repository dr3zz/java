import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;

public class Product implements Comparable<Product> {

	private String productName;
	private double productPrice;
	private Product Fruit;
	private ArrayList<Product> fruits = new ArrayList<>();
	private String readFile;
	

	public ArrayList<Product> getFruits() {

		return fruits;
	}

	public String getReadFile() {
		return readFile;
	}

	public void setReadFile(String readFile) {

		try (BufferedReader br = new BufferedReader(new FileReader(readFile));) {

			while (true) {
				String line = br.readLine();
				if (line == null) {
					break;
				}
				Product product = new Product();
				String[] str = line.split(" ");
				product.Fruit(str[0], Double.parseDouble(str[1]));
				fruits.add(product);

			}
		} catch (Exception e) {
			System.out.println("Error. File does not exist");
		}
		this.readFile = readFile;
	}

	public void setFruits(ArrayList<Product> fruits) {
		this.fruits = fruits;
	}

	public String getProductName() {

		return productName;
	}

	public Comparator<? super Product> Fruit(String productName,
			double productPrice) {
		this.productName = productName;
		this.productPrice = productPrice;
		return null;

	}

	public Product getFruit() {

		return Fruit;

	}

	public double getProductPrice() {
		return productPrice;
	}

	public int compareTo(Product compareFruit) {

		double price = ((Product) compareFruit).getProductPrice();

		// ascending order
		if (this.productPrice > price)
			return 1;
		else if (this.productPrice == price)
			return 0;
		return -1;
	}

	

}
