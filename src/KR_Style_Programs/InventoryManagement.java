package KR_Style_Programs;

import java.util.Objects;
import java.util.Scanner;

public class InventoryManagement {
	public static void main(String... args) {
		int MAX_SIZE = 100;
		String[] productNames = new String[MAX_SIZE];
		int[] productQuantity = new int[MAX_SIZE];
		double[] productPrices = new double[MAX_SIZE];
		int itemCount = 0;
		boolean running = true;

		Scanner scanner = new Scanner(System.in);

		int choice;

		System.out.println(
				"1. show_all 2.add product 3. delete product 4. search product 5. update product 6. Quit"
		);
		choice = scanner.nextInt();

		while (running) {
			if (choice == 1) {
				if (itemCount > 0) {
					for (int i = 0; i <= itemCount; i++) {
						System.out.println("product name: " + productNames[i] + "quantity: " + productQuantity[i]
								+ "price: " + productPrices[i]
						);
					}
				} else {
					System.out.println("No products in the inventory");
				}
			} else if (choice == 2) {
				if (itemCount < MAX_SIZE) {
					System.out.println("Enter the product name: ");
					String prodName = scanner.next();

					System.out.println("Enter the product quantity: ");
					int prodQuantity = scanner.nextInt();

					System.out.println("Enter the product price: ");
					double prodPrice = scanner.nextDouble();

					productNames[itemCount] = prodName;
					productQuantity[itemCount] = prodQuantity;
					productPrices[itemCount] = prodPrice;

					itemCount++;
					System.out.println("Product has been successfully added");
				} else {
					System.out.println("Can not add item, inventory is full");
				}


			} else if (choice == 3) {
				System.out.println("Enter the product name to be deleted: ");
				String prodName = scanner.next();
				for (int i = 0; i < itemCount; i++) {
					if (Objects.equals(prodName, productNames[i])) {
						productNames[i] = null;
						productPrices[i] = 0.0;
						productQuantity[i] = 0;
						itemCount--;
					} else {
						System.out.println("No such product");
					}
				}

			} else if (choice == 4) {
				System.out.println("Enter the product name to be deleted: ");
				String prodName = scanner.next();
				for (int i = 0; i < itemCount; i++) {
					if (Objects.equals(prodName, productNames[i])) {
						System.out.println("name: " + productNames[i]);
					} else {
						System.out.println("No such product");
					}
				}

			} else if (choice == 6) {
				System.out.println("Exiting the program ...");
				running = false;
			} else {
				System.out.println("quitting");
			}
		}


	}


}
