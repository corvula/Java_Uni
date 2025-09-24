package ua.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Appointment {
    private Patient patient;
    private Doctor doctor;
    private LocalDateTime appointmentDateTime;

    public Appointment(Patient patient, Doctor doctor, LocalDateTime appointmentDateTime) {
        setPatient(patient);
        setDoctor(doctor);
        setAppointmentDateTime(appointmentDateTime);
    }

    public Patient getPatient() { return patient; }
    public void setPatient(Patient patient) {
        if (patient == null) throw new IllegalArgumentException("Patient cannot be null");
        this.patient = patient;
    }

    public Doctor getDoctor() { return doctor; }
    public void setDoctor(Doctor doctor) {
        if (doctor == null) throw new IllegalArgumentException("Doctor cannot be null");
        this.doctor = doctor;
    }

    public LocalDateTime getAppointmentDateTime() { return appointmentDateTime; }
    public void setAppointmentDateTime(LocalDateTime appointmentDateTime) {
        if (appointmentDateTime == null || appointmentDateTime.isBefore(LocalDateTime.now())) {
            throw new IllegalArgumentException("Invalid appointment date");
        }
        this.appointmentDateTime = appointmentDateTime;
    }

    @Override
    public String toString() {
        return String.format("Appointment{patient=%s, doctor=%s, time=%s}",
                patient.getPatientId(), doctor.getLastName(), appointmentDateTime);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Appointment)) return false;
        Appointment that = (Appointment) o;
        return Objects.equals(patient, that.patient) &&
               Objects.equals(doctor, that.doctor) &&
               Objects.equals(appointmentDateTime, that.appointmentDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patient, doctor, appointmentDateTime);
    }
}
