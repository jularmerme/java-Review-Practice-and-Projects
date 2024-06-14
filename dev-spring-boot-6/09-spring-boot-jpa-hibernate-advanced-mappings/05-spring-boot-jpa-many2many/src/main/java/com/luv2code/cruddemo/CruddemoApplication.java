package com.luv2code.cruddemo;

import com.luv2code.cruddemo.dao.AppDAO;
import com.luv2code.cruddemo.entity.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AppDAO appDAO) {
		return runner -> {

			// createCourseAndStudents(appDAO);
			// findCourseAndStudents(appDAO);
			// findStudentAndCourses(appDAO);
			// addMoreCoursesForStudent(appDAO);
			// deleteCourse(appDAO);
			deleteStudent(appDAO);

		};
	}

	private void deleteStudent(AppDAO appDAO) {

		int theId = 2;
		appDAO.deleteStudent(theId);
		System.out.println("Done!!!!");
	}

	private void deleteCourse(AppDAO appDAO) {

		int theId = 10;
		System.out.println("Deleting course with id: " + theId);
		appDAO.deleteCourseById(theId);
		System.out.println("Done!!!");

	}

	private void addMoreCoursesForStudent(AppDAO appDAO) {
		int theId = 2;

		Student tempStudent = appDAO.findStudentAndCourseByStudentId(theId);

		// Create more courses
		Course tempCourse = new Course("Spring REST");
		Course tempCourse1 = new Course("Spring JPA/Hibernate");

		tempStudent.addCourse(tempCourse);
		tempStudent.addCourse(tempCourse1);

		System.out.println("Saving student: " + tempStudent);
		System.out.println("Associated Courses: " + tempStudent.getCourses());

		appDAO.update(tempStudent);

		System.out.println("Done!!!");
	}

	private void findStudentAndCourses(AppDAO appDAO) {
		int theId = 1;

		Student tempStudent = appDAO.findStudentAndCourseByStudentId(theId);

		System.out.println("Student: " + tempStudent);
		System.out.println("Courses: " + tempStudent.getCourses());

		System.out.println("Done!!!!");
	}

	private void findCourseAndStudents(AppDAO appDAO) {
		int theId = 10;

		Course tempCourse = appDAO.findCourseAndStudentsByCourseId(theId);

		System.out.println("Loaded Course: " + tempCourse);
		System.out.println("Students: " + tempCourse.getStudents());

		System.out.println("Done!!!!");
	}

	private void createCourseAndStudents(AppDAO appDAO) {

		// Create a course
		Course tempCourse = new Course("Spring Boot 3");

		// Create the students
		Student tempStudentOne = new Student("john", "Smith", "jsmith@pacman.com");
		Student tempStudentTwo = new Student("Mary", "Gordon", "mgordon@tetris.com");
		Student tempStudentThree = new Student("susan", "Perez", "sperez@lolo.org");

		// Add students to the course
		tempCourse.addStudent(tempStudentOne);
		tempCourse.addStudent(tempStudentTwo);
		tempCourse.addStudent(tempStudentThree);

		// Save the course and associated students
		System.out.println("Saving the course: " + tempCourse);
		System.out.println("Associated Students: " + tempCourse.getStudents());

		appDAO.save(tempCourse);
		System.out.println("Done!!!");

	}
}
