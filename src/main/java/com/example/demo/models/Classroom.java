package com.example.demo.models;

import java.util.ArrayList;
import java.util.List;

public class Classroom {

    ArrayList<Instructors> instructors;
    ArrayList<Students> students;

    public Classroom(ArrayList<Students> students, ArrayList<Instructors> instructors){
        this.instructors=instructors;
        this.students=students;
    }
}
