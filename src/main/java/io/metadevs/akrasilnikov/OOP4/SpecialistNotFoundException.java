package io.metadevs.akrasilnikov.OOP4;

import java.util.NoSuchElementException;

public class SpecialistNotFoundException extends NoSuchElementException {
    public SpecialistNotFoundException(String message){
        super(message);
    }
}