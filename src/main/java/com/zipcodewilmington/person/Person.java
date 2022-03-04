package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;

    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
    }

    public Person(String name, int age) {
    }

    public void setName(String name) {
    }

    public void setAge(int age) {
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }
}
