package com.epam.library.DAO;

import com.epam.library.domain.bean.Report;
import com.epam.library.domain.entity.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 15.03.2017.
 */
public class ReportDAOImpl implements ReportDAO {

    public List<Report> findEmplWhoReadMoreThanOneBook() {
        return new ArrayList<Report>(){
            {
                add(new Report(new Employee("b","mail", 1990), 2));
                add(new Report(new Employee("a","mail", 1990), 3));
                add(new Report(new Employee("b","mail", 1990), 20));
                add(new Report(new Employee("a","mail", 1990), 301));
            }
        };
    }

    public List<Report> findEmplWhoReadLessThanOrEqualsTwoBooks() {
        return new ArrayList<Report>(){
            {
                add(new Report(new Employee("b","mail", 1990), 2));
                add(new Report(new Employee("a","mail", 1990), 0));
                add(new Report(new Employee("b","mail", 1990), 1));
                add(new Report(new Employee("a","mail", 1990), 2));
            }
        };
    }
}
