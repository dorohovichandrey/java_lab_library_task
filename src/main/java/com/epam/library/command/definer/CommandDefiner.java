package com.epam.library.command.definer;

import com.epam.library.command.AbstractCommand;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by User on 14.03.2017.
 */
public class CommandDefiner {
    private static final Logger LOGGER = LogManager.getLogger();

    public AbstractCommand define(String request) {
        LOGGER.info("Command: " + request);
        CommandType currentCommandType = CommandType.valueOf(request.toUpperCase());
        AbstractCommand curCommand = currentCommandType.getCommand();
        return curCommand;
    }
}
