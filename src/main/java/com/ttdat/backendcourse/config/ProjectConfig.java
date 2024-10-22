package com.ttdat.backendcourse.config;

import com.ttdat.backendcourse.beans.Person;
import com.ttdat.backendcourse.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Vehicle vehicle() {
        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleName("BMW");
        return vehicle;
    }
//
//    @Bean
//    public Person person(Vehicle vehicle) {
//        Person person = new Person();
//        person.setName("John");
//        person.setVehicle(vehicle);
//        return person;
//    }

//    @Bean
//    public Vehicle vehicle1() {
//        Vehicle vehicle = new Vehicle();
//        vehicle.setVehicleName("BMW");
//        return vehicle;
//    }
//
//    @Bean
//    public Vehicle vehicle2() {
//        Vehicle vehicle = new Vehicle();
//        vehicle.setVehicleName("Audi");
//        return vehicle;
//    }


}
