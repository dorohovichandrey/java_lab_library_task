package com.epam.library.command.impl;

import com.epam.library.command.AbstractCommand;
import com.epam.library.exception.ServiceException;
import com.epam.library.service.ReportService;

/**
 * Created by User on 14.03.2017.
 */
public class ShowNotSoCleverEmployeesCommand extends AbstractCommand {

    public void tryToExecute() throws ServiceException {
        ReportService reportService = new ReportService();
        reportService.showNotSoCleverEmployees();
    }
}
