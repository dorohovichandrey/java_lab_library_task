package com.epam.library.domain.bean;

import com.epam.library.domain.entity.Employee;

/**
 * Created by User on 14.03.2017.
 */
public class Report {

    Employee employee;
    Integer amountOfBooks;

    public Report() {
        employee = new Employee();
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Report report = (Report) o;

        if (!employee.equals(report.employee)) return false;
        return amountOfBooks.equals(report.amountOfBooks);

    }

    @Override
    public int hashCode() {
        int result = employee.hashCode();
        result = 31 * result + amountOfBooks.hashCode();
        return result;
    }
}
