package com.epam.library.utility.inputscanner;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by User on 15.03.2017.
 */
public class InputScanner {

    private InputStream inputStream = System.in;
    private Scanner scanner = new Scanner(inputStream);

    private InputScanner(){}

    private static class InputScannerHelper{
        private static final InputScanner INSTANCE = new InputScanner();
    }

    public static InputScanner getInstance(){
        return InputScannerHelper.INSTANCE;
    }

    public String next(){
        return scanner.next();
    }


}
