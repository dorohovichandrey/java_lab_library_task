package com.epam.library.domain.bean;

import com.epam.library.domain.entity.Book;
import com.epam.library.domain.entity.Employee;

/**
 * Created by User on 14.03.2017.
 */
public class Report {

    Employee employee;
    Integer numberOfBooks;

    public Report(Employee employee, Integer numberOfBooks) {
        this.employee = employee;
        this.numberOfBooks = numberOfBooks;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Integer getNumberOfBooks() {
        return numberOfBooks;
    }

    public void setNumberOfBooks(Integer numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }
}
