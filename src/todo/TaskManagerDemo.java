package todo;

import java.util.Scanner;

public class TaskManagerDemo {
	public static void main(String... args) {
		// Main Application logic
		boolean isRunning = false;
		User currentUser = null;

		Scanner scanner = new Scanner(System.in);
		System.out.println("HEllO do you want to manage your tasks[y(yes) n(no):  ");
		String userChoice = scanner.next();

		if (userChoice.equalsIgnoreCase("y")){
			isRunning = true;
			while (isRunning){
				Scanner scannerTwo = new Scanner(System.in);
				System.out.println(
						"""         
								1. create Task
								2. show tasks
								3. update status
								4. quit
								"""
				);
				String secondChoice = scanner.next();

				switch (secondChoice){
					case "1" -> {
						currentUser = new User("Nahom", 18);
						if(currentUser.createTask("wash dishes", "TODO")){
							System.out.println("task created successfully");
						}else{
							System.out.println("Wasn't successful");
						}

					}
					case "2" -> {
						assert currentUser != null;
						if (currentUser.taskListEmpty()){
							System.out.println("No tasks to display");
						}else{
							currentUser.displayTasks();
						}
					}

					case "4" -> isRunning = false;

				}


				}

		}else {
			System.out.println("OK bye");
		}
	}
}
