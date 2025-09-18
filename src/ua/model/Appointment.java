package ua.model;

import ua.util.ValidationHelper;
import java.time.LocalDateTime;

public class Appointment {
    private Patient patient;
    private Doctor doctor;
    private LocalDateTime appointmentDateTime;

    public Appointment(Patient patient, Doctor doctor, LocalDateTime appointmentDateTime) {
        ValidationHelper.requireNonNull(patient, "Patient");
        ValidationHelper.requireNonNull(doctor, "Doctor");
        ValidationHelper.requireFuture(appointmentDateTime, "Appointment DateTime");
        this.patient = patient;
        this.doctor = doctor;
        this.appointmentDateTime = appointmentDateTime;
    }

    public Patient getPatient() { return patient; }
    public Doctor getDoctor() { return doctor; }
    public LocalDateTime getAppointmentDateTime() { return appointmentDateTime; }

    @Override
    public String toString() {
        return "Appointment: " + patient + " with " + doctor + " at " + appointmentDateTime;
    }
}
