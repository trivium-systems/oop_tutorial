import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int n = scanner.nextInt();

    for (int i = 1; i <= 10; i++) {
        System.out.printf("%d x %d = %d%n", n, i, n * i);
    }
}