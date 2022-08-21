package io.metadevs.akrasilnikov.OOP;

public class SpecialistAlreadyExistsInCompanyException extends IllegalArgumentException {
    public SpecialistAlreadyExistsInCompanyException(String message){
        super(message);
    }
}