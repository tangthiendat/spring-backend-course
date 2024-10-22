package com.ttdat.backendcourse.beans;

import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name = "DAT";
    private Vehicle vehicle;

//    @Autowired //optional
    public Person( Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
