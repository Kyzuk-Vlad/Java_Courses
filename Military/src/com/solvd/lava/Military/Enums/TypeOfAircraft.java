package com.solvd.lava.Military.Enums;

public enum TypeOfAircraft {
    HELICOPTER("Attacking, Transporting, Surveillance, Rescue"),
    PLANE("Destroyer, Bomber, Stormtrooper, Percussionist");
    private final String value;

    TypeOfAircraft(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
