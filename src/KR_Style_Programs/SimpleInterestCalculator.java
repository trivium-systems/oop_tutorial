import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter Principal (P): ");
    double p = scanner.nextDouble();

    System.out.print("Enter Time (T in years): ");
    double t = scanner.nextDouble();

    System.out.print("Enter Rate (R): ");
    double r = scanner.nextDouble();

    double interest = (p * t * r) / 100;

    System.out.println("Simple Interest: " + interest);
}