package com.epam.library.domain.entity;

import java.util.Date;

/**
 * Created by User on 14.03.2017.
 */
public class Employee extends AbstractEntity<Integer> {

    private String name;
    private String email;
    private Date dateOfBirth;

    public Employee(){}
    public Employee(Integer id, String name, String email, Date dateOfBirth) {
        super(id);
        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    public Employee(String name, String email, Date dateOfBirth) {
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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
