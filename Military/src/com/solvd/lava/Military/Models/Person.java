package com.solvd.lava.Military.Models;

import com.solvd.lava.Military.Enums.Corps;

abstract public class Person {
    private String Name;
    private String SurName;
    private int Age;
    private String sex;

    public Person(){}

    public Person(String name, String SurName, int age,String sex)
    {
        this.Name = name;
        this.SurName = SurName;
        this.Age = age;
        this.sex = sex;
    }
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurName() {
        return SurName;
    }

    public void setSurName(String surName) {
        SurName = surName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


    public String toString() {
        return Name + "\n" +
                " surName: " + SurName + "\n" +
                " age: " + Age + "\n" +
                " sex: " + sex;
    }
}
