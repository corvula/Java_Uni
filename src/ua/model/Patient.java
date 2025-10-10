package ua.model;

import java.time.LocalDate;
import java.util.Objects;
import ua.model.enums.Specialty;

public class Patient {
    private String firstName;
    private String lastName;
    private String patientId;
    private LocalDate birthDate;

    public Patient(String firstName, String lastName, String patientId, LocalDate birthDate) {
        setFirstName(firstName);
        setLastName(lastName);
        setPatientId(patientId);
        setBirthDate(birthDate);
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

    public String getPatientId() { return patientId; }
    public void setPatientId(String patientId) {
        if (patientId == null || patientId.isBlank()) {
            throw new IllegalArgumentException("Invalid patient ID");
        }
        this.patientId = patientId;
    }

    public LocalDate getBirthDate() { return birthDate; }
    public void setBirthDate(LocalDate birthDate) {
        if (birthDate == null || birthDate.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Invalid birth date");
        }
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return String.format("Patient{id='%s', name='%s %s', birthDate=%s}", 
                patientId, firstName, lastName, birthDate);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Patient)) return false;
        Patient patient = (Patient) o;
        return Objects.equals(patientId, patient.patientId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patientId);
    }
}
