package oop.course;

public class Student extends Person {
	private final String batchYear;

	Student(String name, String gender, String batchYear){
		super(name, gender);
		this.batchYear = batchYear;
	}

	public String getBatchYear() {
		return batchYear;
	}

	@Override
	public String toString() {
		return super.toString() +
				" batchYear='" + batchYear + '\''
				;
	}
}
