package model;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void calculateGPA() {
        Course course1 = new Course(0001, 123, "Math", "A Math Class", 3);
        Course course2 = new Course(0002, 234, "Science", "A Science Class", 2);
        Course course3 = new Course(0003, 345, "Music", "A Music Class", 4);
        Student jerry = new Student(1, "Jerry");
        jerry.enrollCourse(course1);
        jerry.enrollCourse(course2);
        jerry.enrollCourse(course3);
        jerry.setGrade(course1, 4.0);
        jerry.setGrade(course2, 2.666);
        jerry.setGrade(course3, 3.333);
        assertEquals(3.4071111111111114, jerry.calculateGPA());

    }

    @Test
    void enrollCourse() {
        Course eCourse1 = new Course(1, 001, "Example1", "An Example1 Course", 3);
        Student eStudent1 = new Student(1, "Example1 Student");
        eStudent1.enrollCourse(eCourse1);
        assertEquals(1, eStudent1.getEnrolledCourses().size());
    }

    @Test
    void setGrade() {
        Course eCourse2 = new Course(2, 002, "Example2", "An Example2 Course", 3);
        Student eStudent2 = new Student(2, "Example2 Student");
        eStudent2.enrollCourse(eCourse2);
        assertTrue(eStudent2.setGrade(eCourse2, 4));
        Course eCourse3 = new Course(3, 003, "Example3", "An Example3 Course", 3);
        Student eStudent3 = new Student(3, "Example3 Student");
        assertFalse(eStudent3.setGrade(eCourse3, 3.5));
    }
}