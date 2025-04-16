import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int n = scanner.nextInt();

    long fact = 1;
    for (int i = 2; i <= n; i++) {
        fact *= i;
    }

    System.out.println("Factorial: " + fact);
}