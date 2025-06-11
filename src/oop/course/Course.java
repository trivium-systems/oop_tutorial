package oop.course;

public class Course {
	private String courseName;
	private String courseCode;
	private Student[] students;
	private int enrolledStudentCount;
	private int size;


	Course(String courseName, String courseCode, int size) {
		this.courseName = courseName;
		this.courseCode = courseCode;
		this.students = new Student[size];
	}


	public boolean enrollStudent(Student student) {
		boolean found = false;
		for (Student stu : students) {
			if (stu != null) {
				if (stu.getName().equals(student.getName())) {
					found = true;
					break;
				}
			}
		}

		if ((enrolledStudentCount) == (size - 1)) {
			System.out.println("No space");
			return false;
		}

		if (found) {
			System.out.println("Student is already enrolled");
			return false;
		}

		students[enrolledStudentCount++] = student;
		return true;
	}

	public void displayStudents() {
		if (enrolledStudentCount != 0) {
			for (Student student : students) {
				System.out.println(student);
			}
		}
	}

}
