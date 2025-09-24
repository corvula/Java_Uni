package ua.util;

import ua.model.Patient;
import ua.model.Doctor;

import java.time.LocalDate;

public class Utils {
    public static Patient createPatient(String firstName, String lastName, String patientId, LocalDate birthDate) {
        if (!ValidationHelper.isValidId(patientId)) {
            throw new IllegalArgumentException("Invalid patient ID");
        }
        return new Patient(firstName, lastName, patientId, birthDate);
    }

    public static Doctor createDoctor(String firstName, String lastName, String specialty) {
        return new Doctor(firstName, lastName, specialty);
    }
}
