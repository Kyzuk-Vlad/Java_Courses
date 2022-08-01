package com.solvd.lava.Military.Models;

import com.solvd.lava.Military.Enums.Corps;
import com.solvd.lava.Military.Enums.TypeOfAircraft;

public class Wheeled extends Machinery
{
    private float Height;
    private float Width;
    private int ArmorClass; //from 1 to 5

    public Wheeled(){}

    public Wheeled(String name, String Call_sign, int Year, int Amount_service, float speed, Corps corps, float height, float width, int armorClass)
    {
        super(name, Call_sign, Year, Amount_service,speed, corps);
        this.Height = height;
        this.Width = width;
        this.ArmorClass = armorClass;
    }

    public float getHeight() {
        return Height;
    }

    public void setHeight(float height) {
        Height = height;
    }

    public float getWidth() {
        return Width;
    }

    public void setWidth(float width) {
        Width = width;
    }

    public int getArmorClass() {
        return ArmorClass;
    }

    public void setArmorClass(int armorClass) {
        ArmorClass = armorClass;
    }

    public String toString()
    {
        return getName() + "\n" +
                " Call_sign: " + getCall_sign() + "\n" +
                " Year: " + getYear() + "\n" +
                " Amount_service: " + getAmount_service() + "\n" +
                " Height: " + Height + "\n" +
                " Width: " + Width + "\n" +
                " ArmorClass: " + ArmorClass + "\n" +
                " corps: " + getCorps();
    }
}
