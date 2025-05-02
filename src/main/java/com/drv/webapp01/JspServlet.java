package com.drv.webapp01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(
        name = "JspServlet",
        urlPatterns = {"/jsp"},
        loadOnStartup = 1
)
public class JspServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String data = "Algunos Datos"; // Define a variable with some data
        Integer number = 12; //  Define a number
        String text = "Hi from Servlet"; // Define a text
        request.setAttribute("data", data); // Set the variable in the request
        request.setAttribute("number", number); // Set the number in the request0
        request.setAttribute("text", text); // Set the text in the request
        request.getRequestDispatcher("/WEB-INF/page.jsp")
                .forward(request, response); // Forward to the JSP page
     }
}
