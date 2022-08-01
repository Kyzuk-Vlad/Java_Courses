package com.solvd.lava.Military.Models;

import com.solvd.lava.Military.Enums.Corps;
import com.solvd.lava.Military.Enums.TypeOfVessels;

public class Floating extends Machinery
{
    private TypeOfVessels type;
    private int CannonCount;
    private String CannonName;

    public Floating(){}

    public Floating(String name, String Call_sign, int Year, int Amount_service, Corps corps, float speed, int ccount, String cname, TypeOfVessels type)
    {
        super(name, Call_sign, Year, Amount_service,speed, corps);
        this.CannonName = cname;
        this.CannonCount = ccount;
        this.type = type;
    }

    public int getCannonCount() {
        return CannonCount;
    }

    public void setCannonCount(int cannonCount) {
        CannonCount = cannonCount;
    }

    public String getCannonName() {
        return CannonName;
    }

    public void setCannonName(String cannonName) {
        CannonName = cannonName;
    }

    public TypeOfVessels getType() {
        return type;
    }

    public void setType(TypeOfVessels type) {
        this.type = type;
    }

    public String toString() {
        return getName() + "\n" +
                " Call_sign: " + getCall_sign() + "\n" +
                " Year: " + getYear() + "\n" +
                " Amount_service: " + getAmount_service() + "\n" +
                " Gun Name: " + CannonName + "\n" +
                " Gun Count: " + CannonCount + "\n" +
                " Type_Of_Vessels: " + type + "\n" +
                " corps: " + getCorps();
    }
}
