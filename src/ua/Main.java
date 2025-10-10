package ua;

import ua.model.*;
import ua.model.enums.*; 
import ua.util.Utils;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("John", "Doe", "P123", LocalDate.of(1990, 5, 10));
        Doctor doctor = new Doctor("Alice", "Smith", Specialty.CARDIOLOGIST);

        Appointment appointment = new Appointment(patient, doctor, LocalDateTime.now().plusDays(2));
        Medication med = new Medication("Aspirin", "100mg", "Take twice a day");

        System.out.println(patient);
        System.out.println(doctor);
        System.out.println(appointment);
        System.out.println(med);

        AppointmentStatus status = AppointmentStatus.SCHEDULED;
        System.out.println("Appointment status: " + status);

        MedicationType medType = MedicationType.TABLET;
        System.out.println("Medication type: " + medType);

        String specialtyDescription = Utils.getSpecialtyDescription(doctor.specialty());
        System.out.println("Specialty info: " + specialtyDescription);

        String statusMessage = switch (status) {
            case SCHEDULED -> "Your appointment is scheduled.";
            case COMPLETED -> "Appointment completed.";
            case CANCELED -> "Appointment canceled.";
            case NO_SHOW -> "You missed your appointment.";
        };
        System.out.println(statusMessage);

        try {
            Patient invalid = new Patient("", "Ivanov", "P002", LocalDate.of(1995, 3, 21));
        } catch (IllegalArgumentException e) {
            System.out.println("❌ Validation error: " + e.getMessage());
        }
    }
}
