package ua;

import ua.model.*;
import ua.util.Utils;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // Пацієнт і лікар
        Patient patient = Utils.createPatient("John", "Doe", "P123", LocalDate.of(1990, 5, 10));
        Doctor doctor = Utils.createDoctor("Alice", "Smith", "Cardiologist");

        System.out.println(patient);
        System.out.println(doctor);

        // Запис на прийом
        Appointment appointment = new Appointment(patient, doctor, LocalDateTime.now().plusDays(2));
        System.out.println(appointment);

        // Ліки
        Medication med = new Medication("Aspirin", "100mg", "Take twice a day");
        System.out.println(med);

        // Валідація: спроба створити неправильного пацієнта
        try {
            Patient bad = Utils.createPatient("Bad", "User", "X", LocalDate.of(2026, 1, 1));
        } catch (Exception e) {
            System.out.println("Validation failed: " + e.getMessage());
        }
    }
}
