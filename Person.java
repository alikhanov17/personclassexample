package com.company;

public class Person {
    String name;
    String job;
    String place;
    int age;


    public Person(String name, String place, String job, int age) {
        this.name = name;
        this.job = job;
        this.age = age;
        this.place = place;
    }

    public void name() {
        System.out.println("name: " + name);

    }

    public void jOb() {
        System.out.println("job: " + job);

    }

    public void aGe() {
        System.out.println("age: " + age);
    }

    public void daNcer() {
        System.out.println("place: " + place);
    }


}
