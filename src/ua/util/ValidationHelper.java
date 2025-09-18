package ua.util;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.util.Objects;

class ValidationHelper {

    static void requireNonEmpty(String value, String fieldName) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException(fieldName + " cannot be empty");
        }
    }

    static void requireNonNull(Object value, String fieldName) {
        if (value == null) {
            throw new IllegalArgumentException(fieldName + " cannot be null");
        }
    }

    static void requireFuture(LocalDateTime dateTime, String fieldName) {
        if (dateTime == null || dateTime.isBefore(LocalDateTime.now())) {
            throw new IllegalArgumentException(fieldName + " must be in the future");
        }
    }

    static void requirePast(LocalDate date, String fieldName) {
        if (date == null || date.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException(fieldName + " must be in the past");
        }
    }
}
