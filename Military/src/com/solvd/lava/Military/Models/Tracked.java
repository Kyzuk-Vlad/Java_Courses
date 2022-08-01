package com.solvd.lava.Military.Models;

import com.solvd.lava.Military.Enums.Corps;
import com.solvd.lava.Military.Enums.TypeOfAircraft;

public class Tracked extends Machinery
{
    private float EngineVolume;
    private int CountProjectile;

    public Tracked(){}

    public Tracked(String name, String Call_sign, int Year, int Amount_service, Corps corps, float speed, float EngineVolume, int CountProjectile)
    {
        super(name, Call_sign, Year, Amount_service,speed, corps);

        this.EngineVolume = EngineVolume;
        this.CountProjectile = CountProjectile;
    }

    public float getEngineVolume() {
        return EngineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        EngineVolume = engineVolume;
    }

    public int getCountProjectile() {
        return CountProjectile;
    }

    public void setCountProjectile(int countProjectile) {
        CountProjectile = countProjectile;
    }

    public String toString() {
        return getName() + "\n" +
                " Call_sign: " + getCall_sign() + "\n" +
                " Year: " + getYear() + "\n" +
                " Amount_service: " + getAmount_service() + "\n" +
                " TypeOfAircraft: " + getSpeed() + "\n" +
                " TypeOfAircraft: " + EngineVolume + "\n" +
                " TypeOfAircraft: " + CountProjectile + "\n" +
                " corps: " + getCorps();
    }
}
