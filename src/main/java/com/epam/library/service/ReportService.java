package com.epam.library.service;

import com.epam.library.DAO.ReportDAO;
import com.epam.library.DAO.ReportDAOImpl;
import com.epam.library.domain.bean.Report;
import com.epam.library.utilty.printer.Printer;

import java.util.List;

/**
 * Created by User on 15.03.2017.
 */
public class ReportService {

    private ReportDAO reportDAO = new ReportDAOImpl();
    private Printer printer = new Printer();

    public ReportDAO getReportDAO() {
        return reportDAO;
    }

    public void setReportDAO(ReportDAO reportDAO) {
        this.reportDAO = reportDAO;
    }

    public void showCleverestEmployees(){
        List<Report> reportList = reportDAO.findEmplWhoReadMoreThanOneBook();


        for (Report report : reportList) {
            String msg = formReportForCleverEmpl(report);
            printer.print(msg);

        }
    }

    private String formReportForCleverEmpl(Report report) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(report.getEmployee().getName());
        stringBuilder.append(": ");
        stringBuilder.append(report.getNumberOfBooks());
        return stringBuilder.toString();
    }

    public void showNotSoCleverEmployees(){
        List<Report> reportList = reportDAO.findEmplWhoReadLessThanOrEqualsTwoBooks();


        for (Report report : reportList) {
            String msg = formReportForNotSoCleverEmpl(report);
            printer.print(msg);
        }
    }

    private String formReportForNotSoCleverEmpl(Report report) {
        StringBuilder stringBuilder = new StringBuilder();
        addNameToFormedReportIfNecessary(stringBuilder, report);
        stringBuilder.append(report.getEmployee().getDateOfBirth());
        stringBuilder.append(": ");
        stringBuilder.append(report.getNumberOfBooks());
        return stringBuilder.toString();
    }

    private void addNameToFormedReportIfNecessary(StringBuilder stringBuilder, Report report) {
        if(report.getNumberOfBooks() >= 2){
            stringBuilder.append(report.getEmployee().getName());
            stringBuilder.append(", ");
        }
    }
}
