package com.epam.library.domain.entity;

import com.epam.library.domain.entity.AbstractEntity;

/**
 * Created by User on 14.03.2017.
 */
public class Employee extends AbstractEntity<Integer> {

    private String name;
    private String email;
    private Integer dateOfBirth;

    public Employee(Integer id, String name, String email, Integer dateOfBirth) {
        super(id);
        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    public Employee(String name, String email, Integer dateOfBirth) {
        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Integer dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
