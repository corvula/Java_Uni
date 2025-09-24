package ua.model;
import java.util.Objects;

public class Teacher extends Person {
    protected String subject; 

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public String getSubject() { return subject; }

    public void setSubject(String subject) {
        if (subject == null || subject.isBlank()) {
            throw new IllegalArgumentException("Invalid subject");
        }
        this.subject = subject;
    }

    @Override
    public String toString() {
        return String.format("Teacher{name='%s', age=%d, subject='%s'}", getName(), getAge(), subject);
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(subject, teacher.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), subject);
    }
}
