package com.mp.mp.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class IntStudent {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String name;
    private int age;
    public IntStudent(){

    }
    public IntStudent(Long id, String name, int age ){
        this.id=id;
        this.name=name;
        this.age=age;
    }
    public Long getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setName(String name){
        this.name=name;
    }
}
