package com.epam.library.command.impl;


import com.epam.library.command.AbstractCommand;
import com.epam.library.exception.ServiceException;
import com.epam.library.utility.inputscanner.InputScanner;
import com.epam.library.utility.printer.Printer;

/**
 * Created by User on 15.03.2017.
 */
public class RenameBookByTitleCommand extends AbstractCommand {

    private InputScanner inputScanner = InputScanner.getInstance();
    private Printer printer = Printer.getInstance();



    public void tryToExecute() throws ServiceException {
        printer.println("enter book title:");
        String prevTitle = inputScanner.next();
        printer.println("enter new title:");
        String newTitle = inputScanner.next();


    }
}
