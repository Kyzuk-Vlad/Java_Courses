package com.solvd.lava.Military.Models;

import com.solvd.lava.Military.Enums.Corps;

abstract public class Machinery
{
    private String Name;
    private String Call_sign;
    private int Year;
    private int Amount_service;
    private Corps corps;
    private float speed;
    public Machinery(){}

    public Machinery(String name, String Call_sign, int Year, int Amount_service, float speed, Corps corps)
    {
        this.Name = name;
        this.Call_sign = Call_sign;
        this.Year = Year;
        this.Amount_service = Amount_service;
        this.corps = corps;
        this.speed = speed;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCall_sign() {
        return Call_sign;
    }

    public void setCall_sign(String call_sign) {
        Call_sign = call_sign;
    }
    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }
    public int getAmount_service() {
        return Amount_service;
    }

    public void setAmount_service(int amount_service) {
        Amount_service = amount_service;
    }

    public Corps getCorps() {
        return corps;
    }

    public void setCorps(Corps corps) {
        this.corps = corps;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public String toString() {
        return Name + "\n" +
                " Call_sign: " + Call_sign + "\n" +
                " Year: " + Year + "\n" +
                " Amount_service: " + Amount_service + "\n" +
                " Speed: " + speed + "\n" +
                " corps: " + corps;
    }
}
