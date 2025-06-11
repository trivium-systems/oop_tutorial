package oop;

public class SampleDemo {
	public static void main(String... args) {
		Sample instance = new Sample("Ins1");
		Sample instanceTwo = new Sample("Ins2", 17);
		Sample instanceThree = new Sample();


		System.out.println(instance.getAge());
		System.out.println(instanceTwo.getAge());
		System.out.println(instanceThree.getAge());
		System.out.println(instanceThree.getName());

		instanceThree.setAge(20);
		instanceThree.setName("Ins3");

		System.out.println("After setting name and age");
		System.out.println(instanceThree.getAge());
		System.out.println(instanceThree.getName());

		Sample.printCount();


		int age = instanceThree.incrementAge();
		System.out.println(age);

		int age2 = instanceTwo.incrementAge(5);
		System.out.println(age2);

		int age3 = instance.incrementAge("10");
		System.out.println(age3);
	}
}
