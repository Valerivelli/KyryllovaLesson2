package com.kyryllova.homeworks.hw9;

import java.util.Date;
import lombok.*;

@Value
@Getter
@ToString
@EqualsAndHashCode
public class Author {

    String firstName;
    String lastName;
    Date dateOfBirth;

    public Author(String firstName, String lastName, Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = new Date(dateOfBirth.getTime());
    }

    public Date getDateOfBirth() {
        return new Date(dateOfBirth.getTime());
    }
}
