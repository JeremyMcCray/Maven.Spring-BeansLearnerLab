package com.example.demo.models;

import java.util.Arrays;
import java.util.Iterator;

public class Students extends People<Person> {

    public Students(Student... students){
        super(Arrays.asList(students));

    }

    @Override
    public Iterator<Person> iterator() {
        return new ;
    }
}
