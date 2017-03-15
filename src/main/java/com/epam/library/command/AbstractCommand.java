package com.epam.library.command;

import com.epam.library.exception.CommandException;
import com.epam.library.exception.ServiceException;

/**
 * Created by User on 14.03.2017.
 */
public abstract class AbstractCommand {

    public void execute() throws CommandException{
        try {
            tryToExecute();
        } catch (ServiceException e){
            throw new CommandException("Problem in command", e);
        }
    }

    protected abstract void tryToExecute() throws ServiceException;


}
