package Exceptions;

public class CountOfProductException extends Exception
{
    @Override
    public String toString()
    {
        return "Error. You have to much count of product." +
                "(According to Article 232, you can have no more than 300 items in the store)";
    }
}
