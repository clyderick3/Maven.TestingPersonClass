package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;

    public Person() { //nullary constructor
        this.name = "";
        this.age = Integer.MAX_VALUE;
    }

    public Person(int age) { //parameterized constructor
        this.age = age;
    }

    public Person(String name) { //parameterized constructor
        this.name = name;
    }

    public Person(String name, int age) { //full constructor
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }
}
