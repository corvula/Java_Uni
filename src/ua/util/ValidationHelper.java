package ua.util;

class ValidationHelper {
    static boolean isValidName(String name) {
        return name != null && name.matches("[A-Z][a-zA-Z]{1,20}");
    }

    static boolean isValidAge(int age) {
        return age >= 0 && age <= 120;
    }

    static boolean isValidGrade(int grade) {
        return grade >= 1 && grade <= 12;
    }
}
