/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursemanagement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class CourseList {

    private List<Course> courses;

    Scanner scanner = new Scanner(System.in);

    public CourseList() {
        courses = new ArrayList<>();
    }

    public void add() {
        String courseID = inputString("Course ID: ", "Invalid!");
        boolean check = false;
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getCourseId().equals(courseID)) {
                System.out.println("Course ID exists!");
                check = true;
            }
        }
        if (!check) {
            String courseName = inputString("Course name: ", "Invalid!");
            int credit = inputInt("Credit: ", "Invalid!");
            courses.add(new Course(courseName, courseID, credit));
            System.out.println("Added successfully!");
        }
    }
    
    public Course getCourseById(String id) {
        for (Course course : courses) {
            if (course.getCourseId().equals(id)) {
                return course;
            }
        }
        return null;
    }

    public void listAll() {
        if (courses.isEmpty()) {
            System.out.println("No courses found.");
        } else {
            System.out.println("All Courses:");
            printHeader();
            for (Course course : courses) {
                printCourse(course);
            }
        }
    }

    public void search() {
        System.out.print("Enter the course ID to search: ");
        String courseId = scanner.nextLine();

        Course course = getCourseById(courseId);
        if (course != null) {
            System.out.println("Course found:");
            printHeader();
            printCourse(course);
        } else {
            System.out.println("Course not found.");
        }
    }

    public void sort() {
        if (courses.isEmpty()) {
            System.out.println("No courses found.");
        } else {
            Collections.sort(courses);
            System.out.println("Courses sorted by number of credits (ascending):");
            printHeader();
            for (Course course : courses) {
                printCourse(course);
            }
        }
    }

    public void update() {
        System.out.print("Enter the course ID to update: ");
        String courseId = scanner.nextLine();

        Course courseToUpdate = getCourseById(courseId);
        if (courseToUpdate != null) {
            System.out.print("Enter the new course name: ");
            String newCourseName = scanner.nextLine();

            int newNumberOfCredits = inputInt("Enter the new number of credits: ", "Invalid input! Please enter a non-negative number.");

            courseToUpdate.setCourseName(newCourseName);
            courseToUpdate.setCredit(newNumberOfCredits);

            System.out.println("Course information updated successfully.");
        } else {
            System.out.println("Course not found.");
        }
    }

    public void printCourse(Course course) {
        System.out.format("%-15s%-25s%-10d%n", course.getCourseId(), course.getCourseName(), course.getCredit());
    }

    public void printHeader() {
        System.out.format("%-15s%-25s%-10s%n", "Course ID", "Course Name", "Credits");
        System.out.println("-----------------------------------------------");
    }

    public int inputInt(String message, String errorMessage) {
        int number = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print(message);
                number = scanner.nextInt();
                scanner.nextLine();
                if (number > 0) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Please enter a non-negative number.");
                }
            } catch (Exception e) {
                System.out.println(errorMessage);
                scanner.nextLine();
            }
        }

        return number;
    }

    public String inputString(String message, String errorMessage) {
        String str = "";

        while (true) {
            try {
                System.out.print(message);
                str = scanner.nextLine();
                if (str.trim().isEmpty()) {
                    System.out.println("Invalid input.");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println(errorMessage);
                scanner.nextLine();
            }
        }

        return str;
    }
}
