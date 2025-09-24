package ua.model;

import java.util.Objects;

public class Medication {
    private String name;
    private String dosage;
    private String instructions;

    public Medication(String name, String dosage, String instructions) {
        setName(name);
        setDosage(dosage);
        setInstructions(instructions);
    }

    public String getName() { return name; }
    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Invalid medication name");
        }
        this.name = name;
    }

    public String getDosage() { return dosage; }
    public void setDosage(String dosage) {
        if (dosage == null || dosage.isBlank()) {
            throw new IllegalArgumentException("Invalid dosage");
        }
        this.dosage = dosage;
    }

    public String getInstructions() { return instructions; }
    public void setInstructions(String instructions) {
        if (instructions == null || instructions.isBlank()) {
            throw new IllegalArgumentException("Invalid instructions");
        }
        this.instructions = instructions;
    }

    @Override
    public String toString() {
        return String.format("Medication{name='%s', dosage='%s', instructions='%s'}",
                name, dosage, instructions);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Medication)) return false;
        Medication that = (Medication) o;
        return Objects.equals(name, that.name) &&
               Objects.equals(dosage, that.dosage) &&
               Objects.equals(instructions, that.instructions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dosage, instructions);
    }
}
