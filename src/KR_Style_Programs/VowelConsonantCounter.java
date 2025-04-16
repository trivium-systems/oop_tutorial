import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String text = scanner.nextLine().toLowerCase();

    int vowels = 0, consonants = 0;

    for (char ch : text.toCharArray()) {
        if (Character.isLetter(ch)) {
            if ("aeiou".indexOf(ch) != -1)
                vowels++;
            else
                consonants++;
        }
    }

    System.out.println("Vowels: " + vowels);
    System.out.println("Consonants: " + consonants);
}