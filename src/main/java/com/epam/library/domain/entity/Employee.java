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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Employee employee = (Employee) o;

        if (!name.equals(employee.name)) return false;
        if (!email.equals(employee.email)) return false;
        return dateOfBirth.equals(employee.dateOfBirth);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + email.hashCode();
        result = 31 * result + dateOfBirth.hashCode();
        return result;
    }
}
