package HeadFirstServletsAndJSP.chapter.src.main.java.com.example.Listener;


import HeadFirstServletsAndJSP.chapter.src.main.java.com.example.Dog.Dog;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent event) {
        ServletContext sc = event.getServletContext();
        String dogBreed = sc.getInitParameter("breed1");
        Dog dog = new Dog(dogBreed);
        sc.setAttribute("dog1",dog);

    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }


}
