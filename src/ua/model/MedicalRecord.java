package ua.model;

import ua.util.ValidationHelper;
import java.time.LocalDateTime;

public class MedicalRecord {
    private Patient patient;
    private String diagnosis;
    private String treatments;
    private LocalDateTime recordDateTime;

    public MedicalRecord(Patient patient, String diagnosis, String treatments, LocalDateTime recordDateTime) {
        ValidationHelper.requireNonNull(patient, "Patient");
        ValidationHelper.requireNonEmpty(diagnosis, "Diagnosis");
        ValidationHelper.requireNonEmpty(treatments, "Treatments");
        ValidationHelper.requirePast(recordDateTime.toLocalDate(), "Record DateTime");
        this.patient = patient;
        this.diagnosis = diagnosis;
        this.treatments = treatments;
        this.recordDateTime = recordDateTime;
    }

    @Override
    public String toString() {
        return "MedicalRecord: " + patient + ", Diagnosis=" + diagnosis + ", Treatments=" + treatments + ", Date=" + recordDateTime;
    }
}
