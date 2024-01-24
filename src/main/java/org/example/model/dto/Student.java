package org.example.model.dto;

public class Student {
    private String uni;
    private String age;
    private String name;

    public String getUni() {
        return uni;
    }

    public Student setUni(String uni) {
        this.uni = uni;
        return this;
    }

    public String getAge() {
        return age;
    }

    public Student setAge(String age) {
        this.age = age;
        return this;
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }
}
