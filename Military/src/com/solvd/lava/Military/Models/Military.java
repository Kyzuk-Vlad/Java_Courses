package com.solvd.lava.Military.Models;
import com.solvd.lava.Military.Enums.Corps;

abstract public class Military extends Person
{
    private float experience;
    private Corps corps;
    private String Rank;
    private float Salary;

    public Military(){}

    public Military(String Name, String SurName, int age,String sex, float experience, String rank, Corps corps,float Salary)
    {
        super(Name, SurName, age, sex);
        this.experience = experience;
        this.Rank = rank;
        this.corps = corps;
        this.Salary = Salary;
    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }

    public String getRank() {
        return Rank;
    }

    public void setRank(String rank) {
        Rank = rank;
    }

    public Corps getCorps() {
        return corps;
    }

    public void setCorps(Corps corps) {
        this.corps = corps;
    }

    public float getSalary() {
        return Salary;
    }

    public void setSalary(float salary) {
        Salary = salary;
    }
    public String toString()
    {
        return getName() + "\n" +
                " surName: " + getSurName() + "\n" +
                " age: " + getAge() + "\n" +
                " sex: " + getSex() + "\n" +
                " Rank: " + Rank + "\n" +
                " Salary: " + Salary + "\n" +
                " experience: " + experience + "\n" +
                " corps: " + corps;
    }
}
