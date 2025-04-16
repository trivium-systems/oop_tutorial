import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String text = scanner.nextLine();

    int letters = 0, digits = 0, spaces = 0, special = 0;

    for (char ch : text.toCharArray()) {
        if (Character.isLetter(ch)) letters++;
        else if (Character.isDigit(ch)) digits++;
        else if (Character.isWhitespace(ch)) spaces++;
        else special++;
    }

    System.out.println("Letters: " + letters);
    System.out.println("Digits: " + digits);
    System.out.println("Whitespaces: " + spaces);
    System.out.println("Special characters: " + special);
}