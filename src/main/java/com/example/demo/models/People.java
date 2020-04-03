package com.example.demo.models;

import java.util.LinkedList;
import java.util.List;

public abstract class People<PersonType extends Person> implements Iterable<PersonType>{

   List<PersonType> personList;

    public People(List<PersonType> list){
        this.personList = list;
    }

    public void add(PersonType person){
        this.personList.add(person);
    }

    public void remove(PersonType person){
        this.personList.remove(person);
    }

    public Integer size(){
        return this.personList.size();
    }

    public void clear(){
        this.personList.clear();
    }

    public void addAll(Iterable<PersonType> iterables){
        for(PersonType elem : iterables){
            this.personList.add(elem);
        }
    }

    public PersonType findById(int id){
        return personList.get(id);
    }

    public List<PersonType> findAll(){
        return this.personList;
    }
}
