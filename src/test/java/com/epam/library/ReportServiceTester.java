package com.epam.library;


import com.epam.library.DAO.IReportDAO;
import com.epam.library.DAO.impl.ReportDAO;
import com.epam.library.domain.bean.Report;
import com.epam.library.domain.entity.Employee;
import com.epam.library.service.ReportService;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 14.03.2017.
 */
public class ReportServiceTester {

/*
    IReportDAO reportDAO = new ReportDAO() {

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
    };


    @Test
    public void testShowCleverestEmployees(){
        ReportService reportService = new ReportService();
        reportService.setReportDAO(reportDAO);
        reportService.showCleverestEmployees();
    }

    @Test
    public void testShowNotSoCleverEmployees(){
        ReportService reportService = new ReportService();
        reportService.setReportDAO(reportDAO);
        reportService.showNotSoCleverEmployees();
    }*/
}
