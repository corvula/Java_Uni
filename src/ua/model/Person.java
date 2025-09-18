package ua.model;

import ua.util.ValidationHelper;
import java.time.LocalDate;

public class Patient extends Person {
    private String patientId;
    private LocalDate birthDate;

    public Patient(String firstName, String lastName, String patientId, LocalDate birthDate) {
        super(firstName, lastName);
        ValidationHelper.requireNonEmpty(firstName, "First Name");
        ValidationHelper.requireNonEmpty(lastName, "Last Name");
        ValidationHelper.requireNonEmpty(patientId, "Patient ID");
        ValidationHelper.requirePast(birthDate, "Birth Date");
        this.patientId = patientId;
        this.birthDate = birthDate;
    }

    public String getPatientId() { return patientId; }
    public LocalDate getBirthDate() { return birthDate; }

    @Override
    public String toString() {
        return super.toString() + " [ID=" + patientId + ", DOB=" + birthDate + "]";
    }
}
