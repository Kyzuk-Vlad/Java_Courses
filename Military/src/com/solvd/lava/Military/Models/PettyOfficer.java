package com.solvd.lava.Military.Models;

import com.solvd.lava.Military.Enums.Corps;

public class PettyOfficer extends Military
{
    private String Characteristic;

    public PettyOfficer(){}

    public PettyOfficer(String Name, String SurName, int age, String sex, float experience, String rank, Corps corps, float Salary, String call_sign)
    {
        super(Name, SurName, age, sex, experience, rank, corps, Salary);
        this.Characteristic = call_sign;
    }

    public String toString()
    {
        return getName() + "\n" +
                " surName: " + getSurName() + "\n" +
                " age: " + getAge() + "\n" +
                " sex: " + getSex() + "\n" +
                " experience: " + getExperience() + "\n" +
                " Salary: " + getSalary() + "\n" +
                " Call_sign: " + Characteristic + "\n" +
                " corps: " + getCorps();
    }


}
