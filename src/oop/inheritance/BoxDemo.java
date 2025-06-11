package oop.inheritance;

public class BoxDemo {
	public static void main(String[] args) {
		Box box = new Box(1, 2, 3);
		Box box2 = new BoxWeight(1, 2, 3,4);

		System.out.println(box.equals(box2));
		System.out.println(box2.equals(box));
	}
}
