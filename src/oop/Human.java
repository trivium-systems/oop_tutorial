package oop;

class Human {
	// Data/fields
	// A) Static
	static int count = 0;

	// B) Instance fields/variables
	private String name;
	private final String gender;
	private final double height;

	// Constructor
	Human(String name, String gender, double height) {
		this.name = name;
		this.gender = gender;
		this.height = height;
		count++;
	}

	// Setter and Getter
	public String getGender() {
		return gender;
	}

	public String getName() {
		return name;
	}

	public double getHeight() {
		return height;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Instance Methods
	public void walk() {
		System.out.printf("%s is walking....", this.name);
	}

	public void greet(String name) {
		System.out.printf("Good afternoon %s ", name);
	}

	// Static method
	static int getCount(){
		return count;
	}
}

