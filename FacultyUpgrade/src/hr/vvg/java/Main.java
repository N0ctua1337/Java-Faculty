package hr.vvg.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		List<Professor> professors = new ArrayList<>();
		List<Course> courses = new ArrayList<>();
		List<Exam> exams = new ArrayList<>();
		// List<CourseManagement> courseM= new ArrayList<>();

		Scanner keyboard = new Scanner(System.in);

		for (int i = 0; i < 2; i++) {

			System.out.println("Insert the firstname of the Student: ");
			String firstName = keyboard.nextLine();

			System.out.println("Insert the lastname of the Student: ");
			String lastName = keyboard.nextLine();

			Student student = new Student();
			student.setFirstName(firstName);
			student.setLastName(lastName);
			student.setID(i);
			students.add(student);

		}

		System.out.println("The following students are inserted to the list:");

		for (Student student : students) {
			System.out.println(student.getFirstName() + " " + student.getLastName());
		}

		for (int i = 0; i < 2; i++) {

			System.out.println("Insert the title of the Professor");
			String title = keyboard.nextLine();

			System.out.println("Insert the firstname of the Professor: ");
			String firstName = keyboard.nextLine();

			System.out.println("Insert the lastname of the Professor: ");
			String lastName = keyboard.nextLine();

			Professor professor = new Professor();
			professor.setFirstName(firstName);
			professor.setLastName(lastName);
			professor.setTitle(title);
			professor.setID(i);

			// course.set

			professors.add(professor);

		}

		System.out.println("The following professors are inserted to the list:");

		for (Professor professor : professors) {
			System.out.println(professor.getTitle() + " " + professor.getFirstName() + " " + professor.getLastName());
		}

		for (int i = 0; i < 2; i++) {

			System.out.println("Insert the course name");
			String courseName = keyboard.nextLine();

			System.out.println("Insert the course code: ");
			String code = keyboard.nextLine();

			System.out.println("Insert the ECTS-Points: ");
			int ectsPoints = Integer.parseInt(keyboard.nextLine());

			Course course = new Course();
			course.setCourseName(courseName);
			course.setCode(code);
			course.setEctsPoints(ectsPoints);

			courses.add(course);

		}

		System.out.println("The following courses are inserted to the list:");

		for (Course course : courses) {
			System.out.println(course.getCourseName() + " " + course.getCode() + " " + course.getEctsPoints());
		}
		System.out.println();
		System.out.println("Here we see suitable course to responsible professors");
		for (int i = 0; i < 2; i++) {
			// Here we are making a new Object coursem but don't we need a ArrayList of courseM ? Look at the top!
			CourseManagement coursem = new CourseManagement(courses.get(i), professors.get(i));
			System.out.println("-----------------------------------------------------");
			System.out.println(coursem.course.getCourseName() + " : " + coursem.professor.getFirstName() + " "
					+ coursem.professor.getLastName());
		}
		// TODO Auto-generated method stub
		// System.out.println("hello");
	}
}
