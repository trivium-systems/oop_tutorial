import java.util.Scanner;


// double celsius = (temp - 32) * 5 / 9;


void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Give me a celsius value: ");
    double celsius  = scanner.nextDouble();
    double fahrenheit;

    fahrenheit = (celsius * 9 / 5) + 32;
    System.out.println("degree celsius is equivalent to: " + fahrenheit + "' fahrenheit");

}