package net.josthin.lambdacrud;


import javax.servlet.annotation.WebServlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
@WebServlet
public class LambdacrudApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(LambdacrudApplication.class, args);
    }
}
