package ua.util;

import ua.model.*;

import java.time.LocalDateTime;
import java.time.LocalDate;

public class Utils {

    public static Patient createPatient(String firstName, String lastName, String patientId, LocalDate birthDate) {
        return new Patient(firstName, lastName, patientId, birthDate);
    }

    public static Doctor createDoctor(String firstName, String lastName, String specialty) {
        return new Doctor(firstName, lastName, specialty);
    }

    public static Appointment createAppointment(Patient patient, Doctor doctor, LocalDateTime dateTime) {
        return new Appointment(patient, doctor, dateTime);
    }

    public static Medication createMedication(String name, String dosage, String instructions) {
        return new Medication(name, dosage, instructions);
    }

    public static MedicalRecord createMedicalRecord(Patient patient, String diagnosis, String treatments, LocalDateTime dateTime) {
        return new MedicalRecord(patient, diagnosis, treatments, dateTime);
    }
}
