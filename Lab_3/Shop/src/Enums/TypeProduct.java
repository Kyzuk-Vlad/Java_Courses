package Enums;

public enum TypeProduct
{
    TECH("Laptops&Computers"),
    PRESENTS("Gifts"),
    FASHION("Clothing"),
    BOOKS("Books"),
    GOODS("Groceries");

    private final String value;

    TypeProduct(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
