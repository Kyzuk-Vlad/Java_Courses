package com.solvd.lava.Military.Models;


import com.solvd.lava.Military.Enums.Corps;

public class Recruit extends Military
{
    private boolean IsExp;
    public Recruit(){}

    public Recruit(String Name, String SurName, int age, String sex, float experience, String rank, Corps corps, float Salary, boolean isExp)
    {
        super(Name, SurName, age, sex, experience, rank, corps, Salary);
        this.IsExp = isExp;
    }
    public boolean isExp() {
        return IsExp;
    }

    public void setExp(boolean exp) {
        IsExp = exp;
    }
    public String toString() {
        return getName() + "\n" +
                " surName: " + getSurName() + "\n" +
                " age: " + getAge() + "\n" +
                " sex: " + getSex() + "\n" +
                " experience: " + getExperience() + "\n" +
                " experience: " + IsExp + "\n" +
                " corps: " + getCorps();
    }
}