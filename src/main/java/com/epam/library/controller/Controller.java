package com.epam.library.controller;

import com.epam.library.utilty.command.AbstractCommand;
import com.epam.library.utilty.command.definer.CommandDefiner;
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
        Scanner scanner = new Scanner(System.in);
        CommandDefiner commandDefiner = new CommandDefiner();

        while (true){
            System.out.println("Enter command:");
            String request = scanner.next();
            if(request.equals(END_WORK)){
                break;
            }

            AbstractCommand command;
            try {
                command = commandDefiner.define(request);
            } catch (RuntimeException e){
                LOGGER.error(e);
                System.out.println("Invalid command!!!");
                continue;
            }

            command.execute();
        }
    }



    protected void destroy(){

    }

}
