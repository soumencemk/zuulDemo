package com.soumen.microservices.studentService;

import java.util.UUID;

public class Student {

    private String id;
    private String name;
    private String roll;

    public Student(String name, String roll) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.roll = roll;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }
}
