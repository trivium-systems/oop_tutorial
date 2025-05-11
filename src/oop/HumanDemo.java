package oop;

public class HumanDemo {
	public static void main(String... args) {
		Human humanOne = new Human("Tigist", "Female", 1.75);
		Human humanTwo = new Human("Tony", "male", 1.85);

		humanOne.setName("Helen");

		System.out.println(humanOne.getName());

		System.out.println(Human.getCount());
	}
}
