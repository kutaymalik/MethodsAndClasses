package com.example.methodsandclasses;

public class Musicians {

    String name;
    String instrument;
    int age;

    public Musicians(String name, String instrument, int age) {

        //instance
        //attribute (eşitle)

        this.name = name;
        this.instrument = instrument;
        this.age = age;
        System.out.println("constructor called");
    }
}
