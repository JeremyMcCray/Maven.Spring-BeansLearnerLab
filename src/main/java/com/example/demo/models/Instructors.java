package com.example.demo.models;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Instructors extends People<Instructor>{
    public Instructors(Instructor... list) {
        super(Arrays.asList(list));
    }

    @Override
    public Iterator<Instructor> iterator() {
        return personList.iterator();
    }
}
