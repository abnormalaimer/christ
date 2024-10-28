package HeadFirstServletsAndJSP.chapter.src.main.java.com.example.web;


import HeadFirstServletsAndJSP.chapter.src.main.java.com.example.Dog.Dog;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(name = "ListenerTest",value = "/Listener-Servlet")
public class ListenerTester extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("test context<br>");
        out.println("<br>");
        Dog dog = (Dog)getServletContext().getAttribute("dog1");
        out.println("dog's breed is "+dog.getBreed());

    }
}
