package com.epam.library.domain.bean;

import com.epam.library.domain.entity.Employee;

/**
 * Created by User on 14.03.2017.
 */
public class Report {

    Employee employee;
    Integer amountOfBooks;

    public Report() {
    }

    public Report(Employee employee, Integer amountOfBooks) {
        this.employee = employee;
        this.amountOfBooks = amountOfBooks;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Integer getAmountOfBooks() {
        return amountOfBooks;
    }

    public void setAmountOfBooks(Integer amountOfBooks) {
        this.amountOfBooks = amountOfBooks;
    }
}
