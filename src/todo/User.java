package todo;

import java.util.ArrayList;
import java.util.Arrays;

class User {
	private String name;
	private int age;
	private ArrayList<Task> tasks;

	User(String name, int age) {
		this.name = name;
		this.age = age;
	}


	// CRUD methods
	public boolean createTask(String title, String status) {
		if (!title.isEmpty() && Status.checkValidity(status)) {
			Task newTask = Task.taskFactory(title, this, Status.TODO);
			tasks.add(newTask);
			return true;
		} else {
			System.out.println("The title is empty or the status is invalid!");
		}
		return false;
	}

	public boolean changeStatus(String title, String status){
		Task currentTask = null;
		boolean statusChanged = false;
		for(Task task: tasks){
			if(task.getTitle().equalsIgnoreCase(title)){
				currentTask = task;
			}
		}

		if(currentTask != null){
			statusChanged = currentTask.setStatus(status);
			System.out.println("Status has been updated successfully!");
		}

		return statusChanged;
	}

	public boolean taskListEmpty(){
		return tasks.isEmpty();
	}

	// Display all tasks
	public void displayTasks(){
		for (Task task: tasks){
			System.out.printf(
					"title: %s \n status: %s "
					, task.getTitle(), task.getStatus()
			);
		}
	}
}