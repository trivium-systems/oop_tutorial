import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Temperature Converter");
    System.out.print("Enter 'C' to convert to Celsius or 'F' to convert to Fahrenheit: ");
    String choice = scanner.nextLine();

    System.out.print("Enter the temperature: ");
    double temp = scanner.nextDouble();

    if (choice.equalsIgnoreCase("C")) {
        double celsius = (temp - 32) * 5 / 9;
        System.out.println("Temperature in Celsius: " + celsius);
    } else if (choice.equalsIgnoreCase("F")) {
        double fahrenheit = (temp * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    } else {
        System.out.println("Invalid option.");
    }
}