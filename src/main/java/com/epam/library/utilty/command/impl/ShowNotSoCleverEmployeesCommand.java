package com.epam.library.utilty.command.impl;

import com.epam.library.utilty.command.AbstractCommand;
import com.epam.library.service.ReportService;

/**
 * Created by User on 14.03.2017.
 */
public class ShowNotSoCleverEmployeesCommand extends AbstractCommand {

    public void execute() {
        ReportService reportService = new ReportService();
        reportService.showNotSoCleverEmployees();
    }
}
