package com.solvd.lava.Military.Models;

import com.solvd.lava.Military.Enums.Corps;

public class Soldier extends Military
{
    private int awareness; //from 1 to 10

    public Soldier(){}

    public Soldier(String Name, String SurName, int age, String sex, float experience, String rank, Corps corps, float Salary, int isExp) {
        super(Name, SurName, age, sex, experience, rank, corps, Salary);
        this.awareness = isExp;
    }
    public int getAwareness() {
        return awareness;
    }

    public void SetAwareness(int exp) {
        awareness = exp;
    }
    public String toString() {
        return getName() + "\n" +
                " surName: " + getSurName() + "\n" +
                " age: " + getAge() + "\n" +
                " sex: " + getSex() + "\n" +
                " experience: " + getExperience() + "\n" +
                " experience: " + awareness + "\n" +
                " corps: " + getCorps();
    }
}
