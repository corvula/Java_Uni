package ua.util;

import ua.model.Person;
import ua.model.Student;
import ua.model.Teacher;

public class Utils {
    public static Person createPerson(String name, int age) {
        if (!ValidationHelper.isValidName(name) || !ValidationHelper.isValidAge(age)) {
            throw new IllegalArgumentException("Invalid person data!");
        }
        return new Person(name, age);
    }

    public static Student createStudent(String name, int age, int grade) {
        if (!ValidationHelper.isValidGrade(grade)) {
            throw new IllegalArgumentException("Invalid grade!");
        }
        return new Student(name, age, grade);
    }

    public static Teacher createTeacher(String name, int age, String subject) {
        if (!ValidationHelper.isValidName(name)) {
            throw new IllegalArgumentException("Invalid teacher name!");
        }
        return new Teacher(name, age, subject);
    }
}
