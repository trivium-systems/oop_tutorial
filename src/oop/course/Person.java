package oop.course;

public class Person {
	private String name;
	private String gender;

	Person(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return
				"name='" + name + '\'' +
						", gender='" + gender + '\'';
	}
}
