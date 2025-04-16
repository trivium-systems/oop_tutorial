import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);

    final String USERNAME = "admin";
    final String PASSWORD = "1234";

    System.out.print("Username: ");
    String inputUser = scanner.nextLine();

    System.out.print("Password: ");
    String inputPass = scanner.nextLine();

    if (inputUser.equals(USERNAME) && inputPass.equals(PASSWORD)) {
        System.out.println("Login successful.");
    } else {
        System.out.println("Invalid credentials.");
    }
}