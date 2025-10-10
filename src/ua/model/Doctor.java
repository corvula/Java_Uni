package ua.model;

import java.util.Objects;
import ua.model.enums.Specialty;

public class Doctor {
    private String firstName;
    private String lastName;
    private String specialty;

    public Doctor(String firstName, String lastName, String specialty) {
        setFirstName(firstName);
        setLastName(lastName);
        setSpecialty(specialty);
    }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) {
        if (firstName == null || firstName.isBlank()) {
            throw new IllegalArgumentException("Invalid first name");
        }
        this.firstName = firstName;
    }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) {
        if (lastName == null || lastName.isBlank()) {
            throw new IllegalArgumentException("Invalid last name");
        }
        this.lastName = lastName;
    }

    public String getSpecialty() { return specialty; }
    public void setSpecialty(String specialty) {
        if (specialty == null || specialty.isBlank()) {
            throw new IllegalArgumentException("Invalid specialty");
        }
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return String.format("Doctor{name='%s %s', specialty='%s'}",
                firstName, lastName, specialty);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Doctor)) return false;
        Doctor doctor = (Doctor) o;
        return Objects.equals(firstName, doctor.firstName) &&
               Objects.equals(lastName, doctor.lastName) &&
               Objects.equals(specialty, doctor.specialty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, specialty);
    }
}
