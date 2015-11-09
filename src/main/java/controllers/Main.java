package controllers;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * Created by pxjok on 09.11.2015.
 */
@WebServlet(name = "main", urlPatterns = "/main")
public class Main extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.getRequestDispatcher("WEB-INF/view/main.jsp").forward(request, response);
    }
}
