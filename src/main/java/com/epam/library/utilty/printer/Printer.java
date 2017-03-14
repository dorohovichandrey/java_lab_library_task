package com.epam.library.utilty.printer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by User on 15.03.2017.
 */
public class Printer {

    private static final Logger LOGGER = LogManager.getLogger();

    public void print(String msg){
        System.out.println(msg);
    }
}
