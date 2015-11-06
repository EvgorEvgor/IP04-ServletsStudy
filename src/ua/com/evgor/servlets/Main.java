package ua.com.evgor.servlets;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHandler;

/**
 * Created by Evgor on 01.11.2015.
 *
 */
public class Main {

    Main() {
    }

    public static void main ( String[] args) throws Exception {
        Server server = new Server(8090);
        ServletHandler handler = new ServletHandler();
        server.setHandler(handler);
        handler.addServletWithMapping(HelloServlet.class, "/*");
        server.start();
        server.join();
    }

}
