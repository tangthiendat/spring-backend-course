package com.ttdat.backendcourse;

import com.ttdat.backendcourse.beans.Person;
import com.ttdat.backendcourse.beans.Vehicle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BackendCourseApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext =  SpringApplication.run(BackendCourseApplication.class, args);
        var vehicle1 = applicationContext.getBean(Vehicle.class);
        var vehicle2 = applicationContext.getBean(Vehicle.class);
    }

}
