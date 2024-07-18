import java.util.Scanner;

public class Product {
	int pcode;
	String pname;
	double price;

	public void readData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("pcode: ");
		this.pcode = sc.nextInt();
		System.out.println("pname: ");
		this.pname = sc.next();
		System.out.println("price: ");
		this.price = sc.nextDouble();
	}

	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();

		p1.readData();
		p2.readData();
		p3.readData();

		System.out.println("The lowest price is: ");
		if (p1.price < p2.price && p1.price < p3.price) {
			System.out.println(p1.price);
		} else if (p2.price < p1.price && p2.price < p3.price) {
			System.out.println(p2.price);
		} else {
			System.out.println(p3.price);
		}
	}
}