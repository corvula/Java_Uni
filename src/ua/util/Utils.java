package ua.util;

import ua.model.Patient;
import ua.model.Doctor;
import ua.model.enums.Specialty;

import java.time.LocalDate;

public class Utils {

    public static Patient createPatient(String firstName, String lastName, String patientId, LocalDate birthDate) {
        if (!ValidationHelper.isValidId(patientId)) {
            throw new IllegalArgumentException("Invalid patient ID");
        }
        return new Patient(firstName, lastName, patientId, birthDate);
    }

    public static Doctor createDoctor(String firstName, String lastName, String specialtyName) {
        Specialty specialty;

        specialty = switch (specialtyName.toLowerCase()) {
            case "cardiologist" -> Specialty.CARDIOLOGIST;
            case "dermatologist" -> Specialty.DERMATOLOGIST;
            case "pediatrician" -> Specialty.PEDIATRICIAN;
            case "neurologist" -> Specialty.NEUROLOGIST;
            default -> Specialty.GENERAL_PRACTITIONER;
        };

        return new Doctor(firstName, lastName, specialty);
    }

    public static String getSpecialtyDescription(Specialty specialty) {
        return switch (specialty) {
            case GENERAL_PRACTITIONER -> "Provides general health care.";
            case CARDIOLOGIST -> "Specializes in heart diseases.";
            case DERMATOLOGIST -> "Treats skin conditions.";
            case PEDIATRICIAN -> "Treats children.";
            case NEUROLOGIST -> "Focuses on the nervous system.";
        };
    }
}
