package com.epam.library.command.definer;


import com.epam.library.command.AbstractCommand;
import com.epam.library.command.impl.ShowCleverestEmployeesCommand;
import com.epam.library.command.impl.ShowNotSoCleverEmployeesCommand;

/**
 * Created by User on 14.03.2017.
 */
public enum CommandType {
    CLEVEREST_EMPL(new ShowCleverestEmployeesCommand()),
    NOT_SO_CLEVER_EMPL(new ShowNotSoCleverEmployeesCommand());

    private AbstractCommand command;

    CommandType(AbstractCommand command) {
        this.command = command;
    }

    public AbstractCommand getCommand() {
        return command;
    }
}
