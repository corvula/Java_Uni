package ua.model;

import ua.util.ValidationHelper;

public class Doctor extends Person {
    private String specialty;

    public Doctor(String firstName, String lastName, String specialty) {
        super(firstName, lastName);
        ValidationHelper.requireNonEmpty(firstName, "First Name");
        ValidationHelper.requireNonEmpty(lastName, "Last Name");
        ValidationHelper.requireNonEmpty(specialty, "Specialty");
        this.specialty = specialty;
    }

    public String getSpecialty() { return specialty; }

    @Override
    public String toString() {
        return super.toString() + " [Specialty=" + specialty + "]";
    }
}
