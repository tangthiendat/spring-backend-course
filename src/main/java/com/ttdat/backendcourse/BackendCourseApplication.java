package com.ttdat.backendcourse;

import com.ttdat.backendcourse.beans.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BackendCourseApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext =  SpringApplication.run(BackendCourseApplication.class, args);
        var person = applicationContext.getBean(Person.class);
    }

}
