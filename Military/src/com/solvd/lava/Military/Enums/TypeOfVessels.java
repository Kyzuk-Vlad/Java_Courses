package com.solvd.lava.Military.Enums;

public enum TypeOfVessels {
    AIRCRAFT_CARRIER("Nimitz, artillery, L-401,"),
    CRUISERS("Aviator, L-401, "),
    SUBMARINES("Ramsey, Blyth, Sumy"),
    CUTTER("L-452, P193, P-180");
    private final String value;

    TypeOfVessels(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
