package com.feurle.tiergesund.customers.web;

import lombok.Data;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import com.feurle.tiergesund.customers.model.Pet;
import com.feurle.tiergesund.customers.model.PetType;

@Data
class PetDetails {

    private long id;

    private String name;

    private String owner;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthDate;

    private PetType type;

    PetDetails(Pet pet) {
        this.id = pet.getId();
        this.name = pet.getName();
        this.owner = pet.getOwner().getFirstName() + " " + pet.getOwner().getLastName();
        this.birthDate = pet.getBirthDate();
        this.type = pet.getType();
    }
}
