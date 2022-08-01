package com.solvd.lava.Military.Enums;

public enum Corps {
    ARMY("Infantry, artillery, engineers,Landing"),
    AIR_FORCE("Aviation, Radio engineering troops, Anti-aircraft missile troops"),
    NAVAL_FORCE("Sailor"),
    SPECIAL_FORCE("SpecialForces");
    private final String value;

    Corps(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
