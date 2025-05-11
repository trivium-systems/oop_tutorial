package todo;

import java.time.ZonedDateTime;

class Task {
	private String title;
	private ZonedDateTime createdAt;
	private User creator;
	private String status;

	// Constructor
	Task(String title, User creator, String status){
		this.title = title;
		this.creator = creator;
		this.status = status;
		this.createdAt = ZonedDateTime.now();
	}

	public static Task taskFactory(String title, User creator, String status){
		return new Task(title, creator, status);
	};
	// getters and setters

	public String getStatus() {
		return status;
	}

	public String getTitle() {
		return title;
	}

	public boolean setStatus(String status) {
		if(Status.checkValidity(status)){
			this.status = status;
			return true;
		}
		return false;
	}

	public User getCreator() {
		return creator;
	}

	public ZonedDateTime getCreatedAt() {
		return createdAt;
	}
}
