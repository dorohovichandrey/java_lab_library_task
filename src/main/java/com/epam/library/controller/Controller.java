package com.epam.library.controller;

import com.epam.library.command.AbstractCommand;
import com.epam.library.command.definer.CommandDefiner;
import com.epam.library.exception.CommandException;
import com.epam.library.utility.inputscanner.InputScanner;
import com.epam.library.utility.printer.Printer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

/**
 * Created by User on 14.03.2017.
 */
public class Controller {

    private static final Logger LOGGER = LogManager.getLogger();
    private static final String END_WORK = "exit";

    public void start(){
        init();
        service();
        destroy();
    }

    protected void init(){

    }

    protected void service(){
        InputScanner inputScanner = InputScanner.getInstance();
        Printer printer = Printer.getInstance();
        CommandDefiner commandDefiner = new CommandDefiner();

        while (true){
            printer.println("Enter command:");
            String request = inputScanner.next();
            if(request.equals(END_WORK)){
                break;
            }

            AbstractCommand command;
            try {
                command = commandDefiner.define(request);
            } catch (RuntimeException e){
                LOGGER.error(e);
                printer.println("Invalid command!!!");
                continue;
            }

            try {
                command.execute();
            } catch (CommandException e){
                LOGGER.error("Command execution failure", e);
                printer.println("Command execution failure");
            }
        }
    }



    protected void destroy(){

    }

}
