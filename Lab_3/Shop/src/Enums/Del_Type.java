package Enums;

public enum Del_Type
{
    Selfpickup("Self-pickup"),
    AtHome("Home delivery"),
    InSection("Receive delivery from department");

    private final String value;

    Del_Type(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}