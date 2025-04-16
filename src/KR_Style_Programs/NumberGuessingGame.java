import java.util.Scanner;
import java.util.Random;

void main() {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    int target = random.nextInt(100) + 1;
    int guess;

    System.out.println("Guess a number between 1 and 100");

    do {
        System.out.print("Your guess: ");
        guess = scanner.nextInt();

        if (guess < target) System.out.println("Too low!");
        else if (guess > target) System.out.println("Too high!");
        else System.out.println("Correct!");
    } while (guess != target);
}