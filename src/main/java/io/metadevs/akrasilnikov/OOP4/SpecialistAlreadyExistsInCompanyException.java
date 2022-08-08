package io.metadevs.akrasilnikov.OOP4;

public class SpecialistAlreadyExistsInCompanyException extends IllegalArgumentException {
    public SpecialistAlreadyExistsInCompanyException(String message){
        super(message);
    }
}