package ua.model;

import ua.util.ValidationHelper;

public class Medication {
    private String name;
    private String dosage;
    private String instructions;

    public Medication(String name, String dosage, String instructions) {
        ValidationHelper.requireNonEmpty(name, "Medication Name");
        ValidationHelper.requireNonEmpty(dosage, "Dosage");
        ValidationHelper.requireNonEmpty(instructions, "Instructions");
        this.name = name;
        this.dosage = dosage;
        this.instructions = instructions;
    }

    @Override
    public String toString() {
        return name + " (" + dosage + ") - " + instructions;
    }
}
