package ua.model;
import java.util.Objects;

public class Student extends Person {
    private int grade;

    public Student(String name, int age, int grade) {
        super(name, age);
        setGrade(grade);
    }

    public int getGrade() { return grade; }

    public void setGrade(int grade) {
        if (grade < 1 || grade > 12) {
            throw new IllegalArgumentException("Invalid grade");
        }
        this.grade = grade;
    }

    @Override
    public String toString() {
        return String.format("Student{name='%s', age=%d, grade=%d}", getName(), getAge(), grade);
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return grade == student.grade;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), grade);
    }
}
