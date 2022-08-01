package com.solvd.lava.Military.Models;

import com.solvd.lava.Military.Enums.Corps;

public class Sergeant extends Military{

    private String Call_sign;

    public Sergeant(){}

    public Sergeant(String Name, String SurName, int age, String sex, float experience, String rank, Corps corps, float Salary, String call_sign)
    {
        super(Name, SurName, age, sex, experience, rank, corps, Salary);
        this.Call_sign = call_sign;
    }

    public String toString()
    {
        return getName() + "\n" +
                " surName: " + getSurName() + "\n" +
                " age: " + getAge() + "\n" +
                " sex: " + getSex() + "\n" +
                " experience: " + getExperience() + "\n" +
                " Salary: " + getSalary() + "\n" +
                " Call_sign: " + Call_sign + "\n" +
                " corps: " + getCorps();
    }
}
