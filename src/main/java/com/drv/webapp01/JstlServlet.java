package com.drv.webapp01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

@WebServlet(
        name = "JstlServlet",
        urlPatterns = {"/jstl"},
        loadOnStartup = 1
)
public class JstlServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String data = "Algunos datos";
        request.setAttribute("data", data);
        Boolean bool = true;
        request.setAttribute("bool", bool);
        List<String> list = new LinkedList<>();
        list.add("Hi");
        list.add("from");
        list.add("Servlet");
        list.add("JSTL");
        request.setAttribute("list", list);
        request.getRequestDispatcher("/WEB-INF/jstl.jsp")
                .forward(request, response);
    }
}
