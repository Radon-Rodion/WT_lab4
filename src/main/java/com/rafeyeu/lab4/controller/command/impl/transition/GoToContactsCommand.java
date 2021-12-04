package com.rafeyeu.lab4.controller.command.impl.transition;

import com.rafeyeu.lab4.controller.command.Command;
import com.rafeyeu.lab4.controller.command.CommandResult;
import com.rafeyeu.lab4.controller.command.CommandResultType;
import com.rafeyeu.lab4.controller.context.RequestContext;
import com.rafeyeu.lab4.controller.context.RequestContextHelper;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class GoToContactsCommand implements Command {
    private static final String PAGE = "WEB-INF/view/contacts.jsp";


    @Override
    public CommandResult execute(RequestContextHelper helper, HttpServletResponse response) {
        RequestContext requestContext = helper.createContext();


        helper.updateRequest(requestContext);
        return new CommandResult(PAGE, CommandResultType.FORWARD);
    }
}