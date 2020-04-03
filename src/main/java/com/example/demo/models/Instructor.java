package com.example.demo.models;

import com.example.demo.interfaces.Learner;
import com.example.demo.interfaces.Teacher;

public class Instructor extends Person implements Teacher {
    public Instructor(long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        int counter = 0;
        for (Learner element: learners) {
            counter++;
        }
        for (Learner element: learners) {
            element.learn(numberOfHours/counter);
        }
    }
}
