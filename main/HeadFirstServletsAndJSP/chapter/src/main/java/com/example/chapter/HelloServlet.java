package com.example.chapter;

import java.io.*;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet",initParams = {@WebInitParam(name = "adminEmail", value = "like@qq.com")})


public class HelloServlet extends HttpServlet {
    private String message;

    public void init() throws ServletException {
        message = "Hello World!";
        String adminEmail = getServletConfig().getInitParameter("adminEmail");

        // 检查adminEmail是否已正确加载
        if (adminEmail == null || adminEmail.isEmpty()) {
            throw new ServletException("adminEmail parameter is not set correctly.");
        }
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
        out.println("--------------------");
        Enumeration<String> e = getServletConfig().getInitParameterNames();
        while (e.hasMoreElements()){
            out.println("<br>param name= "+e.nextElement()+"<br>");
            out.println("mail email is "+getServletContext().getInitParameter("mail"));
        }
    }

    public void destroy() {
    }
}