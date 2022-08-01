package com.solvd.lava.Military.Models;
import com.solvd.lava.Military.Enums.Corps;
import com.solvd.lava.Military.Enums.TypeOfAircraft;

public class Fly extends Machinery
{
    private TypeOfAircraft type;

    public Fly(){}

    public Fly(String name, String Call_sign, int Year, int Amount_service, Corps corps,float speed, TypeOfAircraft type)
    {
        super(name, Call_sign, Year, Amount_service,speed, corps);
        this.type = type;
    }

    public TypeOfAircraft getType() {
        return type;
    }

    public void setType(TypeOfAircraft type) {
        this.type = type;
    }

    public String toString() {
        return getName() + "\n" +
                " Call_sign: " + getCall_sign() + "\n" +
                " Year: " + getYear() + "\n" +
                " Amount_service: " + getAmount_service() + "\n" +
                " TypeOfAircraft: " + type + "\n" +
                " corps: " + getCorps();
    }
}
