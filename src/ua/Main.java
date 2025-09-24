package ua;

import java.time.LocalDate;
import java.time.LocalDateTime;
import ua.model.*;
import ua.util.Utils;

public class Main {
    public static void main(String[] args) {
        Patient patient = Utils.createPatient("John", "Doe", "P123", LocalDate.of(1990, 5, 10));
        Doctor doctor = Utils.createDoctor("Alice", "Smith", "Cardiologist");
        Appointment appointment = new Appointment(patient, doctor, LocalDateTime.now().plusDays(2));
        Medication med = new Medication("Aspirin", "100mg", "Take twice a day");

        System.out.println(patient);
        System.out.println(doctor);
        System.out.println(appointment);
        System.out.println(med);
    }
}
