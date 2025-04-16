import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter first number: ");
    double a = scanner.nextDouble();

    System.out.print("Enter operator (+, -, *, /): ");
    char op = scanner.next().charAt(0);

    System.out.print("Enter second number: ");
    double b = scanner.nextDouble();

    switch (op) {
        case '+': System.out.println("Result: " + (a + b)); break;
        case '-': System.out.println("Result: " + (a - b)); break;
        case '*': System.out.println("Result: " + (a * b)); break;
        case '/':
            if (b != 0) System.out.println("Result: " + (a / b));
            else System.out.println("Error: Division by zero.");
            break;
        default: System.out.println("Invalid operator.");
    }
}