package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Student {

    int id;
    String name;
    HashMap<Integer, Double> grades;
    List<Course> enrolledCourses;

    public Student(int anId, String aName){
        id = anId;
        name = aName;
        this.enrolledCourses = new ArrayList<>();
        this.grades = new HashMap<>();
    }

    public void displayCourses(){
        for (int i = 0; i < enrolledCourses.size(); i++) {
            System.out.println("----------------");
            System.out.println("Name:\n  " + enrolledCourses.get(i).getName());
            System.out.println("Description:\n  " + enrolledCourses.get(i).getDescription());
            System.out.println("Credits:\n  " + enrolledCourses.get(i).getCredit());
            System.out.println("ID Number:\n  " + enrolledCourses.get(i).getId());
        }
    }

    public double calculateGPA(){
        Double GPA = 0.0;
        Double totCredits = 0.0;
        for (int i = 0; i < enrolledCourses.size(); i++) {
            GPA = GPA + (grades.get(enrolledCourses.get(i).getId()) * enrolledCourses.get(i).getCredit());
            totCredits = totCredits + enrolledCourses.get(i).getCredit();
        }
        GPA = GPA/totCredits;
        return GPA;
    }

    public void enrollCourse(Course course){
        enrolledCourses.add(course);
    }

    public boolean setGrade(Course course, double grade){
        if (enrolledCourses.contains(course)) { 
            grades.put(course.getId(), grade);
            return true;
        }
        return false;
    }

    public List<Course> getEnrolledCourses(){
        return enrolledCourses;
    }

    public static void main(String[] args) {
        Course course1 = new Course(0001, 123, "Math", "A Math Class", 3);
        Course course2 = new Course(0002, 234, "Science", "A Science Class", 2);
        Course course3 = new Course(0003, 345, "Music", "A Music Class", 4);
        Student jerry = new Student(1, "Jerry");
        jerry.enrollCourse(course1);
        jerry.enrollCourse(course2);
        jerry.enrollCourse(course3);
        jerry.displayCourses();
    }
}
