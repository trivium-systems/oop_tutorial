package KR_Style_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
	static String player1;
	static String player2;
	static String player1Symbol;
	static String player2Symbol;
	static String currentPlayer;
	static Scanner scanner = new Scanner(System.in);
	static String[] boardArray = new String[9];// An array representation of our board values
	static boolean gameState = false; // A variable that stores the state of the game [ ON(TRUE) & OFF ]
	static boolean hasPlayedBefore = false; // Another flag variable to track if this is not the first game played
	static int boardCount;
	public static final String board = """
			\t
			 %s's turn:	      ╔═════╦═════╦════╗
				               %s      %s    %s
				              ╠═════╬═════╬════╣
				               %s      %s    %s
				              ╠═════╬═════╬════║
				               %s      %s    %s
				              ╚═════╩═════╩════╝
			\t""";
	static String startMenu = """
			** TIC TAC TOE**
			1. Play %s
			2. Quit
			Enter your choice:
			""";

	static String announcement = """
			WE HAVE A %s !!!
			%s
			""";

	public static void main(String... args) throws InterruptedException {
		// 1. Display game menu
		show_menu(startMenu);
		int choice = scanner.nextInt(); // A variable to store the users choice

		switch (choice) {
			// 2. If players want to play, ask for their names and start the game
			case 1 -> {
				System.out.print("Player 1: Enter your name: ");
				player1 = scanner.next();
				System.out.print("Player 1: Choose your symbol [ X OR O ]: ");
				player1Symbol = scanner.next();
				System.out.print("Player 2: Enter your name: ");
				player2 = scanner.next();
				player2Symbol = player1Symbol.equalsIgnoreCase("X") ? "O" : "X"; // assign the  other player which ever symbol is left out by player 1
				currentPlayer = String.valueOf(player1);
				clearConsole();
				setUpBoard();
				gameState = true; // We set the flag to true, since we're starting the game
				// 3. Display the board in an unending loop unless user quits or loses
				while (gameState) {
					drawBoard();
					takeUserInput(currentPlayer);
					if (checkBoardAndAnnounce()) {
						resetGame();
						show_menu(startMenu);
						choice = scanner.nextInt();
						switch (choice) {
							case 1 -> {
								System.out.println("** Rematch will start in: **");
								Thread.sleep(1000);
								System.out.println(1);
								Thread.sleep(1000);
								System.out.println(2);
								Thread.sleep(1000);
								System.out.println(3);
								System.out.println("HERE WE GO!!!");
								Thread.sleep(1000);
								clearConsole();
							}
							case 2 -> gameState = false;
						}
					}
				}
			}
			case 2 -> {
				System.out.println("Exiting ...");
			}
			default -> System.out.println("I'm just as confused as you are nigga");
		}

	}


	public static void clearConsole() {
		try {
			if (System.getProperty("os.name").toLowerCase().contains("win")) {
				// First try PowerShell (preferred)
				try {
					new ProcessBuilder("powershell", "-Command", "Clear-Host")
							.inheritIO()
							.start()
							.waitFor();
				} catch (Exception e) {
					// Fall back to cmd if PowerShell fails
					new ProcessBuilder("cmd", "/c", "cls")
							.inheritIO()
							.start()
							.waitFor();
				}
			} else {
				// Unix/macOS
				new ProcessBuilder("clear")
						.inheritIO()
						.start()
						.waitFor();
			}
		} catch (Exception ignored) {
			// Absolute silence - do nothing if all methods fail
		}
	}

	private static void resetGame() {
		setUpBoard();
		switchPlayer();
		hasPlayedBefore = true;
	}

	private static void switchPlayer() {
		currentPlayer = currentPlayer.equalsIgnoreCase(player1) ? String.valueOf(player2) : String.valueOf(player1);
	}

	private static void setUpBoard() {
		Arrays.fill(boardArray, "");
		boardCount = 0;
	}

	private static void show_menu(String menu) {
		if (hasPlayedBefore) {
			System.out.printf(menu, "again");
			return;
		}
		System.out.printf(menu, "");
	}

	private static boolean checkBoardAndAnnounce() {
		String winner = "";
		if ((boardArray[0].equalsIgnoreCase(boardArray[1]) && boardArray[0].equalsIgnoreCase(boardArray[2])) && !boardArray[0].isEmpty()) {
			winner = boardArray[0];
		} else if ((boardArray[3].equalsIgnoreCase(boardArray[4]) && boardArray[3].equalsIgnoreCase(boardArray[5])) && !boardArray[3].isEmpty()) {
			winner = boardArray[3];
		} else if ((boardArray[6].equalsIgnoreCase(boardArray[7]) && boardArray[6].equalsIgnoreCase(boardArray[8])) && !boardArray[6].isEmpty()) {
			winner = boardArray[6];
		} else if ((boardArray[0].equalsIgnoreCase(boardArray[3]) && boardArray[0].equalsIgnoreCase(boardArray[6])) && !boardArray[0].isEmpty()) {
			winner = boardArray[0];
		} else if ((boardArray[1].equalsIgnoreCase(boardArray[4]) && boardArray[1].equalsIgnoreCase(boardArray[7])) && !boardArray[1].isEmpty()) {
			winner = boardArray[1];
		} else if ((boardArray[2].equalsIgnoreCase(boardArray[5]) && boardArray[2].equalsIgnoreCase(boardArray[8])) && !boardArray[2].isEmpty()) {
			winner = boardArray[2];
		} else if ((boardArray[0].equalsIgnoreCase(boardArray[4]) && boardArray[0].equalsIgnoreCase(boardArray[8])) && !boardArray[0].isEmpty()) {
			winner = boardArray[0];
		} else if ((boardArray[2].equalsIgnoreCase(boardArray[4]) && boardArray[2].equalsIgnoreCase(boardArray[6])) && !boardArray[2].isEmpty()) {
			winner = boardArray[2];
		}

		if (winner.isEmpty() && boardIsFull()) {
			System.out.printf(announcement, "DRAW", "THANK YOU FOR PLAYING!");
			return true;
		} else if (!winner.isEmpty()) {
			System.out.printf(announcement, "WIN", winner + " won");
			return true;
		} else return false;
	}

	private static void takeUserInput(String player) {
		if (boardIsFull()) return;
		System.out.println();
		System.out.print("Enter the position you wish to mark:  ");
		var scanner = new Scanner(System.in);
		int input = scanner.nextInt();

		boardArray[input] = currentPlayer.equalsIgnoreCase(player1) ? player1Symbol : player2Symbol;
		boardCount++;

		// Switch to the next player
		switchPlayer();
	}

	private static boolean boardIsFull() {
		return boardCount == 9;
	}

	private static void drawBoard() {
		System.out.printf(
				board,
				currentPlayer,
				boardArray[0], boardArray[1], boardArray[2],
				boardArray[3], boardArray[4], boardArray[5],
				boardArray[6], boardArray[7], boardArray[8]
		);
	}
}
