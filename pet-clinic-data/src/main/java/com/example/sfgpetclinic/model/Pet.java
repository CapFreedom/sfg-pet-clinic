package com.example.sfgpetclinic.model;

import java.time.LocalTime;

public class Pet {
    private LocalTime birthDate;
    private PetType petType;
    private Owner owner;

    public LocalTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalTime birthDate) {
        this.birthDate = birthDate;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
