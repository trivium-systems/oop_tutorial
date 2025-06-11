package oop.course;

public class CourseDemo {
	public static void main(String... args) {
		Course course = new Course("Java", "JV101", 2);
		Student student1 = new Student("Nati", "M", "2025");
		Student student2 = new Student("Tsion", "F", "2025");


		course.enrollStudent(student1);
		course.enrollStudent(student2);

		course.displayStudents();

	}
}
