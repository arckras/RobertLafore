package io.metadevs.akrasilnikov.OOP;

import java.util.NoSuchElementException;

public class SpecialistNotFoundException extends NoSuchElementException {
    public SpecialistNotFoundException(String message) {
        super(message);
    }
}