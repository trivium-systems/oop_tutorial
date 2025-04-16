import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int n = scanner.nextInt();

    boolean isPrime = (n > 1);

    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) {
            isPrime = false;
            break;
        }
    }

    if (isPrime)
        System.out.println(n + " is a prime number.");
    else
        System.out.println(n + " is not a prime number.");
}