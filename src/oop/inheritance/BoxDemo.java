package oop.inheritance;

public class BoxDemo {
	public static void main(String[] args) {
		// Using the Constructor with no arguments
		Box defaultBox = new Box();
		BoxWeight defaultBoxWeight = new BoxWeight();

		// Using the Constructor with all arguments listed
		Box box = new Box(1, 2, 3);
		Box boxWeight = new BoxWeight(1, 2, 3,4);

		// Creating a cube from one dimension
		Box box3 = new Box(4);
		BoxWeight box4 = new BoxWeight(4);

		// Cloning -> Using the constructor that accepts a Box[Weight] object
		Box box5 = new Box(box);
		BoxWeight box6 = new BoxWeight(box4);

		// Demonstration of method Overriding
		box.display(); // -> Calls the display() method in Box
		boxWeight.display(); // -> Calls the display() method in BoxWeight

		// Demonstration of how println calls to_string behind the scenes
		System.out.println(box); // -> this calls the to_string in Box internally
		System.out.println(boxWeight); // -> this calls the to_string in BoxWeight internally

		// Demonstration of member access when a parent reference variable holds an object of the child
		// `boxWeight.weight` will cause a compile time error since boxWeight is considered as a Box because of the reference variable that holds it;


		// Demonstration of the equals method
		System.out.println(box.equals(boxWeight)); // -> returns true since the boxWeight is a kind of Box with the same dimensions
		System.out.println(boxWeight.equals(box)); // -> returns false since a Box isn't always a BoxWeight
	}
}
