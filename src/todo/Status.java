package todo;

public class Status {
	public static final String DONE = "Done";
	public static final String TODO = "Done";
	public static final String DOING = "DOING";

	public static boolean checkValidity(String status) {
		return status.equalsIgnoreCase(DOING) || status.equalsIgnoreCase(TODO) || status.equalsIgnoreCase(DONE);
	}
}
