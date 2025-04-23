import java.util.Scanner;


void main() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Give me a celsius value: ");
	double celsius = scanner.nextDouble();
	double fahrenheit;

	fahrenheit = (celsius * 9 / 5) + 32;
	System.out.println("degree celsius is equivalent to: " + fahrenheit + "' fahrenheit");
}