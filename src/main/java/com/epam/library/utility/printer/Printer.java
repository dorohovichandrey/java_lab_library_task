package com.epam.library.utility.printer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.PrintStream;

/**
 * Created by User on 15.03.2017.
 */
public class Printer {

    private PrintStream printStream = System.out;

    private Printer(){}

    private static class PrinterHelper{
        private static final Printer INSTANCE = new Printer();
    }

    public static Printer getInstance(){
        return PrinterHelper.INSTANCE;
    }

    public void println(String msg){
        printStream.println(msg);
    }



}
