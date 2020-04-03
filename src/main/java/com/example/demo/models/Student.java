package com.example.demo.models;

import com.example.demo.interfaces.Learner;

public class Student extends Person implements Learner {

    double totalStudyTime;

    public Student(long id, String name) {
        super(id, name);
    }

    @Override
    public void learn(double numberOfHours) {
        totalStudyTime+=numberOfHours;
    }

    public double getTotalStudyTime(){
        return this.totalStudyTime;
    }
}
