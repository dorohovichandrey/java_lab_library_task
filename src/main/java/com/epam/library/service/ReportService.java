package com.epam.library.service;

import com.epam.library.DAO.IReportDAO;

import com.epam.library.DAO.impl.ReportDAO;
import com.epam.library.domain.bean.Report;
import com.epam.library.exception.DAOException;
import com.epam.library.exception.ServiceException;
import com.epam.library.utility.printer.Printer;
import javafx.scene.input.DataFormat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

/**
 * Created by User on 15.03.2017.
 */
public class ReportService {
    private static final Logger LOGGER = LogManager.getLogger();

    private IReportDAO reportDAO = new ReportDAO();
    private Printer printer = Printer.getInstance();

    public IReportDAO getReportDAO() {
        return reportDAO;
    }

    public void setReportDAO(IReportDAO reportDAO) {
        this.reportDAO = reportDAO;
    }

    public void showCleverestEmployees() throws ServiceException{
        try {
            tryToShowCleverestEmployees();
        } catch (DAOException e){
            throw new ServiceException("Exception in showCleverestEmployees", e);
        }
    }

    private void tryToShowCleverestEmployees() throws DAOException {
        List<Report> reportList = reportDAO.findReportAboutWhoReadMoreThan(1);
        for (Report report : reportList) {
            String msg = formReportForCleverEmpl(report);
            printer.println(msg);

        }
    }

    private String formReportForCleverEmpl(Report report) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(report.getEmployee().getName());
        stringBuilder.append(": ");
        stringBuilder.append(report.getAmountOfBooks());
        return stringBuilder.toString();
    }

    public void showNotSoCleverEmployees() throws ServiceException{
        try {
            tryToShowNotSoCleverEmployees();
        }catch (DAOException e){
            throw new ServiceException("Exception in showNotSoCleverEmployees", e);
        }
    }

    private void tryToShowNotSoCleverEmployees() throws DAOException {
        List<Report> reportList = reportDAO.findReportAboutWhoReadLessThan(3);
        for (Report report : reportList) {
            String msg = formReportForNotSoCleverEmpl(report);
            printer.println(msg);
        }
    }

    private String formReportForNotSoCleverEmpl(Report report) {
        StringBuilder stringBuilder = new StringBuilder();
        addNameToFormedReportIfNecessary(stringBuilder, report);
        stringBuilder.append(report.getEmployee().getDateOfBirth());
        stringBuilder.append(": ");
        stringBuilder.append(report.getAmountOfBooks());
        return stringBuilder.toString();
    }

    private void addNameToFormedReportIfNecessary(StringBuilder stringBuilder, Report report) {
        if(report.getAmountOfBooks() >= 2){
            stringBuilder.append(report.getEmployee().getName());
            stringBuilder.append(", ");
        }
    }

}
