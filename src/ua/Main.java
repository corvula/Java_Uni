package ua;

import ua.model.*;
import ua.util.Utils;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        try {
            Patient p1 = Utils.createPatient("John", "Doe", "P123", LocalDate.of(1990, 5, 10));
            Doctor d1 = Utils.createDoctor("Alice", "Smith", "Cardiology");
            Appointment a1 = Utils.createAppointment(p1, d1, LocalDateTime.now().plusDays(2));
            Medication m1 = Utils.createMedication("Aspirin", "100mg", "Twice a day");
            MedicalRecord r1 = Utils.createMedicalRecord(p1, "Flu", "Rest and Aspirin", LocalDateTime.now().minusDays(3));

            System.out.println(p1);
            System.out.println(d1);
            System.out.println(a1);
            System.out.println(m1);
            System.out.println(r1);

            System.out.println("\n--- Валідація ---");
            Utils.createPatient("", "Doe", "P124", LocalDate.of(2025, 1, 1)); 

        } catch (Exception e) {
            System.err.println("Помилка: " + e.getMessage());
        }
    }
}
