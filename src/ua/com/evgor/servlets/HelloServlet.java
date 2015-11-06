package ua.com.evgor.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Evgor on 02.11.2015.
 */

public class HelloServlet extends HttpServlet{

    volatile int container;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setStatus(HttpServletResponse.SC_OK);
        response.getWriter().println("<h1>Hello SimpleServlet</h1>");
        response.getWriter().println("You are the "  + container + "th visitors");
        container += 1;
    }
}
